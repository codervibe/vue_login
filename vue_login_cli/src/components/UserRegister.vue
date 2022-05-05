<template>
<div>
  <form action="">
    用户名:<input v-model="user.username" type="text"><br>
    密&nbsp;&nbsp;&nbsp;码:<input v-model="user.password" type="password"><br>
    邮&nbsp;&nbsp;&nbsp;箱:<input type="text" v-model="user.email"><br>
    <input type="button" @click="userRegister" value="注册">
  </form>
</div>
</template>

<script>

export default {
  name: "UserRegister",
  data() {
    return {
      user: {
        username: "",
        password: "",
        email: "",
      }
    }
  },
  methods:{
    userRegister(){
      const url = "http://localhost:8989/vue_login/user/register";

      this.$http.post(url,this.user).then(res => {
        if (res.data.success) {
          console.log("返回的信息");
          console.log(res.data.message);
          // this.$router.push("/login")
        } else {
          console.log("返回的信息");
          console.log(res.data.message);
          console.log("此处应该跳转错误页面");
          // this.$router.push("/login/error")
          // this.$router.push({
          //   path: "/login/error",
          //   query:{message: res.data.message}
          // })
          console.log(this.$route.query.message);

        }
      })
    }
  }
}
</script>

<style scoped>

</style>
