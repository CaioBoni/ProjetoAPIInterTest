# ProjetoAPIInterTest

# Insert Data
insert into JOB (name, required) values ('Development', 1);
insert into JOB (name, required) values ('Test', 1);
insert into TASK (name, completed, created_at, weight) values ('Front', 1, null, 1);
insert into TASK (name, completed, created_at, weight) values ('Back', 1, null, 1);
insert into TASK (name, completed, created_at, weight) values ('System', 1, null, 1);
insert into JOB_TASKS (job_id, tasks_id) values (1, 1);
insert into JOB_TASKS (job_id, tasks_id) values (1, 2);
insert into JOB_TASKS (job_id, tasks_id) values (2, 3);

# Json para método PUT
{
  "id": 4,
  "name": "First task",
  "weight": 5,
  "completed": true,
  "createdAt": "2015-05-23"
}

TODO
