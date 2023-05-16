<template>
  <div>
    <div class="container">
      <div id="link-bar" class="row">
        <div class="col-md-1">
          <div href="#/" class="title-text">主页</div>
        </div>
        <div class="col-md-1">
          <div href="javascript:;" class="title-text" @click="login()">登录</div>
        </div>
        <div class="col-md-1">
          <div href="javascript:;" class="title-text" @click="register()">注册</div>
        </div>
        <div class="col-md-9">
          <div id="title-text-right" v-if="isLogin">{{ username }}登录成功</div>
          <div id="title-text-right" v-else>未登录</div>
        </div>
      </div>

      <div style="text-align: center;">
        <h1>Welcome to Vue Login Project</h1>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "index",
  data: {
    isLogin: false,
    username: "",
    return() {

    }
  },
  methods: {
    login() {
      this.$router.push("/login")
    },
    register() {
      this.$router.push("/register")
    }
  },
  components: {},
  created() {
    console.log("主页创建")
    if (this.$route.query.message !== undefined) {
      console.log(this.$route.query.message);
      console.log(this.$route.query.username);
      this.isLogin = true;
      this.username = this.$route.query.username;


    }

  }
}

</script>

<style scoped>
.title-text {
  font-size: 19px;
  padding-left: 10px;
}

#title-text-right {
  font-size: 19px;
  color: #deea06;
  /*margin-right: 1000px;*/
  /*padding-left: 150px;*/
  /*border: 1px red solid;*/
  /*background-color: azure;*/
  width: 1450px;
}

#link-bar {
  /*background-color: bisque;*/
}

.container {
  width: 100%;
}

.col-md-9 {
  padding-left: 800px;
  /*background-color: #2b669a;*/
}
.col-md-1{
  color: #1b6d85;

}


</style>
