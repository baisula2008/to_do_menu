<template>
  <div class="todo-container">
    <h2 class="title">Todo List</h2>
    <div class="input-container">
      <input v-model="newTodo" @keyup.enter="addTodo" placeholder="Enter a todo item" class="todo-input" />
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
      todos: []
    };
  },
  methods: {
    addTodo() {
      if (this.newTodo.trim() !== '') {
        this.todos.push(this.newTodo.trim());
        this.newTodo = '';
      }
    },
    removeTodo(index) {
      this.todos.splice(index, 1);
    }
  }
};
</script>

<style>
/* Entire page background */
body {
  margin: 0;
  padding: 0;
  font-family: 'Arial', sans-serif;
  background-color: #121212; /* Dark black background */
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background-image: url('/Capture1.PNG'); /* Add the path to the image in the public folder */
  background-size: cover;
  background-repeat: no-repeat;
  background-position: center;
  background-attachment: fixed; /* Keep the background fixed */
}

/* Container for the todo app */
.todo-container {
  background-color: #222; /* Dark gray */
  padding: 40px;
  border-radius: 20px;
  box-shadow: 0 8px 20px rgba(0, 0, 0, 0.5);
  width: 100%;
  max-width: 500px; /* Increase the size of the container */
  text-align: center;
  animation: fadeIn 1s ease-in-out;
  z-index: 1; /* Ensure it stays above the background */
}

/* Title styling */
.title {
  margin-bottom: 25px;
  color: #fff;
  font-size: 28px; /* Increase font size */
  animation: slideIn 0.5s ease-out;
}

/* Input container */
.input-container {
  display: flex;
  gap: 15px;
  margin-bottom: 25px; /* Add more space */
}

/* Input field */
.todo-input {
  flex: 1;
  padding: 12px;
  border: none;
  border-radius: 5px;
  outline: none;
  font-size: 18px; /* Increase font size */
  color: #333;
  background-color: #f0f0f0; /* Light background */
  transition: box-shadow 0.3s;
}

.todo-input:focus {
  box-shadow: 0 0 10px 2px rgba(106, 13, 173, 0.6); /* Purple focus effect */
}

/* Add button */
.add-btn {
  padding: 12px 20px;
  border: none;
  border-radius: 5px;
  background-color: #6a0dad; /* Purple */
  color: white;
  cursor: pointer;
  font-size: 18px; /* Increase font size */
  transition: background-color 0.3s, transform 0.3s;
}

.add-btn:hover {
  background-color: #4b0082; /* Dark purple */
  transform: scale(1.05); /* Zoom effect */
}

/* Todo list */
.todo-list {
  list-style: none;
  padding: 0;
  margin: 0;
}

/* Todo item */
.todo-item {
  background-color: #333; /* Gray */
  border-radius: 10px;
  margin-bottom: 12px;
  padding: 12px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  transition: transform 0.3s, box-shadow 0.3s;
}

.todo-item:hover {
  transform: translateY(-5px); /* Hover effect */
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
}

/* Delete button */
.delete-btn {
  background-color: #e74c3c; /* Red */
  color: white;
  border: none;
  border-radius: 5px;
  padding: 6px 12px;
  cursor: pointer;
  transition: background-color 0.3s, transform 0.3s;
}

.delete-btn:hover {
  background-color: #c0392b; /* Dark red */
  transform: scale(1.1); /* Zoom effect */
}

/* Animations */
@keyframes fadeIn {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}

@keyframes slideIn {
  from {
    transform: translateY(-20px);
  }
  to {
    transform: translateY(0);
  }
}

/* Responsive styles */
@media (max-width: 480px) {
  .todo-container {
    padding: 25px;
    width: 90%;
  }
  .title {
    font-size: 24px;
  }
  .todo-input {
    font-size: 16px;
  }
  .add-btn {
    font-size: 16px;
  }
  .delete-btn {
    padding: 4px 10px;
  }
}
</style>
