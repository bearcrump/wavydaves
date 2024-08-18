--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4 (Debian 16.4-1.pgdg120+1)
-- Dumped by pg_dump version 16.4 (Debian 16.4-1.pgdg120+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: id_seq; Type: SEQUENCE; Schema: public; Owner: WavyDaves
--

CREATE SEQUENCE public.id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.id_seq OWNER TO "WavyDaves";

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: addresses; Type: TABLE; Schema: public; Owner: WavyDaves
--

CREATE TABLE public.addresses (
    id integer DEFAULT nextval('public.id_seq'::regclass) NOT NULL,
    country character varying NOT NULL,
    state character varying NOT NULL,
    city character varying NOT NULL,
    line1 character varying NOT NULL,
    line2 character varying,
    zip integer NOT NULL
);


ALTER TABLE public.addresses OWNER TO "WavyDaves";

--
-- Name: creditcards; Type: TABLE; Schema: public; Owner: WavyDaves
--

CREATE TABLE public.creditcards (
    id integer DEFAULT nextval('public.id_seq'::regclass) NOT NULL,
    addressid integer,
    userid integer,
    cardnumber character varying NOT NULL,
    name character varying NOT NULL,
    expirationdate timestamp with time zone NOT NULL
);


ALTER TABLE public.creditcards OWNER TO "WavyDaves";

--
-- Name: items; Type: TABLE; Schema: public; Owner: WavyDaves
--

CREATE TABLE public.items (
    id integer DEFAULT nextval('public.id_seq'::regclass) NOT NULL,
    name character varying NOT NULL,
    category character varying NOT NULL,
    pricedollars integer NOT NULL,
    pricecents integer NOT NULL,
    size character varying NOT NULL
);


ALTER TABLE public.items OWNER TO "WavyDaves";

--
-- Name: orderitems; Type: TABLE; Schema: public; Owner: WavyDaves
--

CREATE TABLE public.orderitems (
    id integer DEFAULT nextval('public.id_seq'::regclass) NOT NULL,
    orderid integer,
    itemid integer,
    quantity integer
);


ALTER TABLE public.orderitems OWNER TO "WavyDaves";

--
-- Name: orders; Type: TABLE; Schema: public; Owner: WavyDaves
--

CREATE TABLE public.orders (
    id integer DEFAULT nextval('public.id_seq'::regclass) NOT NULL,
    userid integer,
    addressid integer,
    paymenttype character varying NOT NULL,
    name character varying NOT NULL,
    "timestamp" timestamp with time zone NOT NULL,
    totaldollars integer NOT NULL,
    totalcents integer NOT NULL,
    isdelivery boolean NOT NULL
);


ALTER TABLE public.orders OWNER TO "WavyDaves";

--
-- Name: users; Type: TABLE; Schema: public; Owner: WavyDaves
--

CREATE TABLE public.users (
    id integer DEFAULT nextval('public.id_seq'::regclass) NOT NULL,
    creditcardid integer,
    addressid integer,
    firstname character varying NOT NULL,
    lastname character varying NOT NULL,
    email character varying NOT NULL,
    password character varying NOT NULL,
    phonenumber character varying,
    isadmin boolean NOT NULL
);


ALTER TABLE public.users OWNER TO "WavyDaves";

--
-- Data for Name: addresses; Type: TABLE DATA; Schema: public; Owner: WavyDaves
--

COPY public.addresses (id, country, state, city, line1, line2, zip) FROM stdin;
15	USA	MO	Kansas City	6404 North Park Avenue	\N	64118
16	USA	MN	Minneapolis	Downtown in the hood	\N	55112
17	USA	FL	PoundTown	Downtown	\N	66666
19	USA	MO	Kansas City	6404 North Park Avenue	\N	64118
\.


--
-- Data for Name: creditcards; Type: TABLE DATA; Schema: public; Owner: WavyDaves
--

COPY public.creditcards (id, addressid, userid, cardnumber, name, expirationdate) FROM stdin;
23	15	\N	123456789012	John Doe	2025-12-31 23:59:59.999+00
26	16	4	4444444444444444	Dirf McGoogityDoogernhauser	2025-12-31 23:59:59.999+00
\.


--
-- Data for Name: items; Type: TABLE DATA; Schema: public; Owner: WavyDaves
--

COPY public.items (id, name, category, pricedollars, pricecents, size) FROM stdin;
7	Pizza	Pizza	14	99	Medium
8	Carbonated Milk	Beverage	3	99	Half Gallon
9	Wavy Gravy	Condimient	0	99	1 cup
10	Sammich	Sandwich	6	99	Full
11	Hot Dog Water	Beverage	3	99	2 Liter
\.


--
-- Data for Name: orderitems; Type: TABLE DATA; Schema: public; Owner: WavyDaves
--

COPY public.orderitems (id, orderid, itemid, quantity) FROM stdin;
\.


--
-- Data for Name: orders; Type: TABLE DATA; Schema: public; Owner: WavyDaves
--

COPY public.orders (id, userid, addressid, paymenttype, name, "timestamp", totaldollars, totalcents, isdelivery) FROM stdin;
30	2	15	card	John	2024-06-01 18:49:42.402748+00	15	79	f
31	6	15	card	Doot	2024-06-01 18:52:05.911252+00	69	420	t
32	6	15	card	Doot	2024-06-01 19:13:03.04384+00	69	420	t
33	6	15	card	Doot	2024-06-01 19:13:09.133608+00	69	420	t
\.


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: WavyDaves
--

COPY public.users (id, creditcardid, addressid, firstname, lastname, email, password, phonenumber, isadmin) FROM stdin;
4	\N	\N	Dirf	McDoogenhauser	dirfedyermom@dmail.com	asdf	123-456-7890	t
6	\N	\N	Doot	Doot	doot@doot.doot	doot	123-456-7890	t
2	\N	\N	John	Doe	john.doe@example.com	password123	123-456-9999	t
\.


--
-- Name: id_seq; Type: SEQUENCE SET; Schema: public; Owner: WavyDaves
--

SELECT pg_catalog.setval('public.id_seq', 33, true);


--
-- Name: addresses address_pk; Type: CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.addresses
    ADD CONSTRAINT address_pk PRIMARY KEY (id);


--
-- Name: creditcards creditcards_pk; Type: CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.creditcards
    ADD CONSTRAINT creditcards_pk PRIMARY KEY (id);


--
-- Name: items items_pk; Type: CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.items
    ADD CONSTRAINT items_pk PRIMARY KEY (id);


--
-- Name: orderitems orderitems_pk; Type: CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.orderitems
    ADD CONSTRAINT orderitems_pk PRIMARY KEY (id);


--
-- Name: orders orders_pk; Type: CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pk PRIMARY KEY (id);


--
-- Name: users user_pk; Type: CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT user_pk PRIMARY KEY (id);


--
-- Name: creditcards creditcards_addresses_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.creditcards
    ADD CONSTRAINT creditcards_addresses_fk FOREIGN KEY (addressid) REFERENCES public.addresses(id);


--
-- Name: creditcards creditcards_users_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.creditcards
    ADD CONSTRAINT creditcards_users_fk FOREIGN KEY (userid) REFERENCES public.users(id);


--
-- Name: orderitems orderitems_items_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.orderitems
    ADD CONSTRAINT orderitems_items_fk FOREIGN KEY (itemid) REFERENCES public.items(id);


--
-- Name: orderitems orderitems_orders_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.orderitems
    ADD CONSTRAINT orderitems_orders_fk FOREIGN KEY (orderid) REFERENCES public.orders(id);


--
-- Name: orders orders_addresses_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_addresses_fk FOREIGN KEY (addressid) REFERENCES public.addresses(id);


--
-- Name: orders orders_users_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_users_fk FOREIGN KEY (userid) REFERENCES public.users(id);


--
-- Name: users users_addresses_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_addresses_fk FOREIGN KEY (addressid) REFERENCES public.addresses(id);


--
-- Name: users users_creditcards_fk; Type: FK CONSTRAINT; Schema: public; Owner: WavyDaves
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_creditcards_fk FOREIGN KEY (creditcardid) REFERENCES public.creditcards(id);


--
-- PostgreSQL database dump complete
--

