<script lang="ts" setup>
import { userRole } from '@/stores/userInfo'

const swaggerUrl = `${import.meta.env.VITE_BASE_URL}/swagger-ui.html`

const userRoleOptions = ['viewer', 'ceedsParticipant', 'ceedsEntitiy', 'dataspaceFacilitator']
</script>

<template>
  <aside class="sidebar-nav">
    <RouterLink to="/" class="logo">
      <img src="/INSIEME_Logo.png" alt="logo" />
    </RouterLink>

    <nav>
      <RouterLink to="/"> Home </RouterLink>
      <a :href="swaggerUrl" target="_blank">API</a>
    </nav>

    <div class="account">
      <label class="account-label" for="userSelect">Logged in as:</label>
      <div class="select-wrapper">
        <select v-model="userRole" id="userSelect">
          <option v-for="role in userRoleOptions" :key="role">
            {{ role }}
          </option>
        </select>
      </div>
      <a class="sign-out">Sign Out</a>
    </div>
  </aside>
</template>

<style scoped>
.sidebar-nav {
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  min-height: 100vh;
  width: 15rem;
  padding: var(--spacing-xlg) var(--spacing-lg);
  background-color: var(--light);
  border-right: 1px solid #e4e4e4;
}

.logo {
  margin-bottom: var(--spacing-xxl);
}

.logo img {
  display: block;
  height: 2.25rem;
}

nav {
  display: flex;
  flex-direction: column;
  gap: var(--spacing-lg);
}

nav a {
  color: var(--dark);
  text-decoration: none;
  font-size: 1rem;
}

nav a.router-link-active {
  font-weight: 700;
}

.account {
  margin-top: auto;
  display: flex;
  flex-direction: column;
  gap: var(--spacing-sm);
}

.account-label {
  font-size: 0.85rem;
  color: var(--dark);
}

.select-wrapper {
  position: relative;
}

.select-wrapper::after {
  content: '›';
  position: absolute;
  top: 50%;
  right: var(--spacing-md);
  transform: translateY(-50%);
  color: var(--dark);
  font-size: 1.1rem;
  pointer-events: none;
}

#userSelect {
  width: 100%;
  box-sizing: border-box;
  appearance: none;
  padding: var(--spacing-sm) var(--spacing-xlg) var(--spacing-sm) var(--spacing-md);
  border: 1px solid #d0d0d0;
  border-radius: 1.25rem;
  background-color: var(--light);
  color: var(--dark);
  font-size: 0.95rem;
  text-transform: capitalize;
  cursor: pointer;
}

.sign-out {
  color: var(--dark);
  text-decoration: none;
  font-size: 0.95rem;
  cursor: pointer;
}
</style>
