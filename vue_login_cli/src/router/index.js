import Vue from 'vue'
import Router from 'vue-router'
import Index from '../components/index'
import UserLogin from '../components/userLogin'
import User from '../components/User'
import Error from '../components/loginError'
import UserRegister from '../components/userRegister'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/index'
    },
    {
      path: '/index',
      name: 'Index',
      component: Index
    },
    {
      path: '/login',
      name: 'UserLogin',
      component: UserLogin,
      children:[
        {
          path:'user',
          name:'User',
          component: User
        },
        {
          path:'error',
          name:'Error',
          component: Error
        },
      ]
    },
    {
      path: '/register',
      name: 'UserRegister',
      component: UserRegister,
    }


  ]
})
