# CRUD with Hibernate

Project description: This is a simple project, where we can use employee for multiple options based on CRUD Pattern and the DAO technique that we are going to use is HIBERNATE.

Technologies: Spring Boot / Spring MVC / MySQL / IntellIJ / RESTful / DTO Pattern / Postman

Session currentSession = entityManager.unwrap(Session.class);
Query<Model> query = currentSession.createQuery("From Model", Model.class);
