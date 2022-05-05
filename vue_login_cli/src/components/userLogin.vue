<template>
  <div>
    <h1>用户登录</h1>
    <form action="">
      用户名:<input v-model="user.username" type="text"><br>
      密&nbsp;&nbsp;&nbsp;码:<input v-model="user.password" type="password"><br>
      <input type="button" @click="userLogin" value="登录">
    </form>
    <router-view/>
  </div>


</template>

<script>
export default {
  name: "userLogin",
  data() {
    return {
      user: {
        username: "",
        password: ""
      }
    }
  },
  methods: {
    userLogin() {
      const url = "http://localhost:8989/vue_login/user/login";
      console.log("userLogin");
      console.log(this.user);
      this.$http.post(url, this.user).then(res => {
        console.log("this.user.name");
        console.log(this.user.username);
        console.log("this.user.password")
        console.log(this.user.password);
        console.log(res.data.success);
        if (res.data.success) {
          console.log("返回的信息");
          console.log(res.data.message);
          this.$router.push("/login/user")
        } else {
          console.log("返回的信息");
          console.log(res.data.message);
          console.log("此处应该跳转错误页面");
          // this.$router.push("/login/error")
          this.$router.push({
            path: "/login/error",
            query:{message: res.data.message}
          })
          console.log(this.$route.query.message);

        }

      })
    }
  },
  components: {},
  created() {
  },
  watch: {
    $route: {
      handler: function (val,oldVal) {
        console.log(oldVal);
        console.log(val);
        console.log("由" + oldVal.path + "转换为新的路径" + val.path);
        if (val.path == "/user") {
          this.findAll()
        }
      },
      //深度观察监听
      deep: true
    }
  }
}
</script>

<style scoped>

</style>
