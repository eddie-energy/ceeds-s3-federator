<script lang="ts" setup>
import ReferenceObjectCard from '@/components/ReferenceObjectCard.vue'
import 'vue3-carousel/carousel.css'
import { referenceDataObjects } from '@/stores/referenceDataObject'
import { Carousel, Slide, Pagination, Navigation } from 'vue3-carousel'

const carouselConfig = {
  itemsToShow: 3,
  gap: 64,
  wrapAround: true,
}
</script>

<template>
  <main class="dashboard">
    <h1>S3 - CEEDS Reference Data Registry</h1>
    <section>
      <h2 class="carousel-title">Reference Data Entries</h2>
      <div class="carousel-wrapper">
        <Carousel v-bind="carouselConfig">
          <Slide v-for="object in referenceDataObjects" :key="object.id">
            <ReferenceObjectCard v-bind="object" />
          </Slide>
          <template #addons>
            <Navigation />
            <Pagination />
          </template>
        </Carousel>
      </div>
    </section>
    <section>
      <h2 class="carousel-title">Application Programmable Interface (API)</h2>
      <div></div>
    </section>
  </main>
</template>

<style scoped>
.dashboard {
  padding: var(--spacing-xxl) var(--spacing-xxl) 0;
}

h1 {
  margin: 0 0 var(--spacing-xxl);
  font-size: 1.75rem;
  text-align: center;
}

section {
  margin-bottom: var(--spacing-xxl);
}

section h2 {
  margin: 0 0 var(--spacing-lg);
  font-size: 1.375rem;
  font-weight: 400;
}

.carousel-title {
  padding-inline-start: calc(var(--spacing-xxl) + var(--spacing-sm));
}

.carousel-wrapper {
  padding-inline: var(--spacing-xxl);
}

:deep(.carousel__slide) {
  padding: var(--spacing-sm);
  align-items: stretch;
}

:deep(.carousel__prev) {
  inset-inline-start: calc(var(--spacing-sm) - var(--spacing-xxl));
}

:deep(.carousel__next) {
  inset-inline-end: calc(var(--spacing-sm) - var(--spacing-xxl));
}

:deep(.carousel__pagination) {
  position: static;
  left: auto;
  transform: none;
  margin-top: var(--spacing-xlg);
}
</style>
