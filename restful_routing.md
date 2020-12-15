# WHAT IS RESTFUL ROUTING CONVENTIONS
 - Mapping HTTP Verbs w/ urls to CRUD commands/functionality

READ
1. GET /shows - RETRIEVING all shows
7. GET /shows/{id} -RETRIEVING one show

CREATE
2. GET /shows/new - RENDERING a form for a new show
3. POST /shows/new - CREATING a new show

UPDATE
4. GET /shows/{id}/edit - RENDERING a form for editing a show
5. PUT /shows/{id}/edit - UPDATE a existing show

DELETE
6. DELETE /shows/{id} - DELETE an existing show