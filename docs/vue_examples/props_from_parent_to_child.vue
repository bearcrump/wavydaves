<script type="module">
import { createApp, ref } from 'vue'
import ChildComp from './ChildComp.js'

createApp({
  components: {
    ChildComp
  },
  setup() {
    const greeting = ref('Hello from parent')

    return {
      greeting
    }
  }
}).mount('#app')
</script>

<div id="app">
  <child-comp :msg="greeting"></child-comp>
</div>