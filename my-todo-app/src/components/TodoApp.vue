<template>
  <div class="todo-container">
    <h2 class="title">Todo List</h2>
    <div class="input-container">
      <input v-model="newTodo" @keyup.enter="addTodo" placeholder="Enter a new todo" class="todo-input" />
      <button @click="addTodo" class="add-btn">Add</button>
    </div>
    <ul class="todo-list">
      <li v-for="(todo, index) in todos" :key="index" class="todo-item">
        <span>{{ todo }}</span>
        <button @click="removeTodo(index)" class="delete-btn">Delete</button>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      newTodo: '',
      todos: JSON.parse(localStorage.getItem('todos')) || [] // 从本地存储加载已保存的待办事项
    };
  },
  methods: {
    addTodo() {
      if (this.newTodo.trim() !== '') {
        this.todos.push(this.newTodo.trim());
        this.newTodo = '';
        localStorage.setItem('todos', JSON.stringify(this.todos));
      }
    },
    removeTodo(index) {
      this.todos.splice(index, 1);
      localStorage.setItem('todos', JSON.stringify(this.todos));
    }
  }
};
</script>

<style>
/* 添加样式 */
</style>
