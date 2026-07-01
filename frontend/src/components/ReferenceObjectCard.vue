<script lang="ts" setup>
import type { components } from '@/schema'
import ButtonLink from './ButtonLink.vue'
import ArrowRightIcon from '@/assets/icons/ArrowRightIcon.svg'

const { name, description, id } = defineProps<components['schemas']['ReferenceDataObjectDetail']>()
</script>

<template>
  <div class="reference-object-card">
    <h3>{{ name }}</h3>
    <p>{{ description }}</p>
    <ButtonLink
      component="RouterLink"
      :to="`/reference-data-objects/${id}`"
      buttonStyle="secondary"
      class="explore-button"
    >
      Explore <ArrowRightIcon />
    </ButtonLink>
  </div>
</template>

<style scoped>
.reference-object-card {
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  align-items: center;
  height: 100%;
  width: 100%;
  padding: var(--spacing-xxl) var(--spacing-xlg);
  gap: var(--spacing-md);
  background-color: var(--light);
  border: 1px solid #e2e2e2;
  border-radius: var(--default-border-radius);
  text-align: center;
}

h3 {
  margin: 0;
  font-size: 1.375rem;
}

p {
  margin: 0 0 var(--spacing-md);
  flex: 1;
  color: var(--dark);
}

.explore-button {
  margin-top: auto;
}
</style>
