<script type="module">
import { createApp } from 'vue'
import ChildComp from './ChildComp.js'

createApp({
  components: {
    ChildComp
  }
}).mount('#app')
</script>

<div id="app">
  <child-comp></child-comp>
</div>