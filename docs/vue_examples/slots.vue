<script type="module">
import { createApp, ref } from 'vue'
import ChildComp from './ChildComp.js'

createApp({
  components: {
    ChildComp
  },
  setup() {
    const msg = ref('from parent')

    return {
      msg
    }
  }
}).mount('#app')
</script>

<div id="app">
  <child-comp>Message: {{ msg }}</child-comp>
</div>