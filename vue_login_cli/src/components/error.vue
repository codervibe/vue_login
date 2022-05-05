<template>
<div>
  <h1>登录错误{{msg}}</h1>
</div>
</template>

<script>
export default {
  name: "error",
  data(){
    return{
      msg:""
    }
  },
  components:{},
  methods:{},
  created() {
    //本来信息应该是从后台拿的但是这里只有一个接口的网站并不能返回信息所以
    this.msg = this.$route.query.message

  }

}
</script>

<style scoped>

</style>
