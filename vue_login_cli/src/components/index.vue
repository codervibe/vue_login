<template>
  <div>
    <a href="#/" class="title-text">主页</a>
    <a href="javascript:;"  class="title-text" @click="login()">登录</a>
    <a href="javascript:;"  class="title-text" @click="register()">注册</a>
    <div style="text-align: center;">
      <h1>Welcome to Vue Login Project</h1>
    </div>
  </div>
</template>

<script>
export default {
  name: "index",
  data: {
    return() {

    }
  },
  methods: {
    login() {
      this.$router.push("/login")
    },
    register(){
      this.$router.push("/register")
    }
  },
  components: {},
  created() {
  }
}

</script>

<style scoped>
.title-text{
  font-size:19px
}
</style>
