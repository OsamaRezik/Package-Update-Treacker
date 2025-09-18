# 📦 Reactive Package Tracking with Spring WebFlux & MongoDB Change Streams

A demo project showing how to build **real-time package tracking** using  
**Spring Boot (WebFlux)**, **Reactive MongoDB**, and **Change Streams**.

Instead of relying on traditional polling, this service streams live updates directly from MongoDB to connected clients via **Server-Sent Events (SSE)** — making it easy to watch packages move from **Shipped → In Transit → Delivered** in real time.

---

## 🚀 Features
- **Reactive stack**: Built with Spring WebFlux and Reactive MongoDB.
- **Change Streams**: Subscribe to live database changes instead of polling.
- **SSE streaming**: Expose real-time updates to dashboards and UIs.
- **REST API**:
  - `POST /packages` → insert new package events.
  - `GET /packages/stream` → consume live updates as SSE.

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot 3 (WebFlux)**
