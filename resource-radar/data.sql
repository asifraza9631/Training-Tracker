CREATE TABLE organization (
  id VARCHAR(255) PRIMARY KEY,
  name VARCHAR(255)
);

INSERT INTO organization (id, name) VALUES ('FL', 'Fission Computer Labs');


CREATE TABLE designation (
  id VARCHAR(255) PRIMARY KEY,
  name VARCHAR(255),
  org_id VARCHAR(255),
  created_by VARCHAR(255),
  created_time TIMESTAMP,
  modified_by VARCHAR(255),
  modified_time TIMESTAMP,
  FOREIGN KEY (org_id) REFERENCES organization(id)
);

-- Enable the uuid-ossp extension (if not already enabled)
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";


INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Software Engineer -QA', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Motion graphic designer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior L&D Coordinator', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'TA Head', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'TA Specialist', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'TA Trainee', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Director of Engineering', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Associate Software Engineer - QA', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Director of Engineering & Sales', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation(id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Principal Architect', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Systems and Network Engineer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Business Development Executive', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Inside Sales Executive', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Manager - Marketing & Sales', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Digital Marketing Associate', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Digital Marketing Executive', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Director - Sales', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Facility Assistants', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Office Admin & Facilities Executive', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Associate Talent Acquisition Partner', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Director - TA', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'HR Coordinator', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'HR Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Associate Network & Systems Engineer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Accounts Executive', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Graphic Designer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Contractor/Consultant', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Team Lead', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Intern', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Tech Lead', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Technical Architect', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Project Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Principle Architect', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Manager - Finance & Accounts', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Vice-President', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Vice-President', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Vice President - Finance & Operations', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Director - HR & TA', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Co-Founder', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'CEO', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'TA Lead', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Systems and Network Administrator', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'System Admin', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Director - Sales', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Business Analyst', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Business Analyst', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'HR Executive', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Lead Data Migration Engineer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Associate Lead Engineer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Lead - Business Analyst', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Project Coordinator', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Product Owner', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Associate Business Analyst', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Lead Salesforce QA', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'VP - Salesforce India', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Vice President - Salesforce', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Technical Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Dy.Manager ADMIN & Facility', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Facilities Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Data Migration Engineer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Business Analyst', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Networking & Systems Intern', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Visual Designer', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Talent Acquisition Partner', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Delivery Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Associate Project Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Lead Data Scientist', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Recruitment Coordinator', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Finance and Accounts Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Program Manager', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'TPM', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'ATPM', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);
INSERT INTO designation (id, name, org_id, created_by, created_time, modified_by, modified_time)
VALUES (uuid_generate_v4(), 'Senior Recruiter', 'FL', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP);








CREATE TABLE practice (
  id VARCHAR(255) PRIMARY KEY,
  name VARCHAR(255),
  org_id VARCHAR(255),
  FOREIGN KEY (org_id) REFERENCES organization(id)
);

INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Software Development', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Data Analytics', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Cloud Computing', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Mobile App Development', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'UI/UX Design', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Data Science', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Machine Learning', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Web Development', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Database Management', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Network Administration', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Cybersecurity', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Artificial Intelligence', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Cloud Security', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Front-end Development', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Back-end Development', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Full-stack Development', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Marketing', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Sales', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Human Resources', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Finance', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Graphic Design', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Product Management', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Quality Assurance', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Data Engineering', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'IT Security', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'DevOps', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'AWS', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'AZURE', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'GCP', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'SpringBoot', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Java', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Microservices', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Angular', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Node Js', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'React Js', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Sales Force', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Python', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Selenium', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Manual', 'FL');
INSERT INTO practice (id, name, org_id) VALUES (uuid_generate_v4(), 'Vertex', 'FL');

CREATE TABLE skills (
  id VARCHAR(255) PRIMARY KEY,
  name VARCHAR(255),
  org_id VARCHAR(255),
  FOREIGN KEY (org_id) REFERENCES organization(id)
);

INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Java', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Python', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'C++', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'JavaScript', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'HTML', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'CSS', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'React', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Angular', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Node.js', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Express.js', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Spring', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Hibernate', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Ruby', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Rails', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Database Management', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Machine Learning', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Data Analysis', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Project Management', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Network Security', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Database Administration', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Cloud Computing', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Cloud Computing', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Data Science', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Data Visualization', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'UI/UX Design', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Graphic Design', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Quality Assurance', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Software Testing', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Cybersecurity', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Network Administration', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'SpringBoot', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Microservice', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Spark', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'Hadoop', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'AWS', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'AZURE', 'FL');
INSERT INTO skills (id, name, org_id) VALUES (uuid_generate_v4(), 'GCP', 'FL');


CREATE TABLE departments (
  id VARCHAR(255) PRIMARY KEY,
  name VARCHAR(255),
  email_alias VARCHAR(255),
  created_by VARCHAR(255),
  created_time TIMESTAMP,
  modified_by VARCHAR(255),
  modified_time TIMESTAMP,
  org_id VARCHAR(255),
  parent_department_id VARCHAR(255),
  type VARCHAR(255),
  FOREIGN KEY (parent_department_id) REFERENCES departments(id)
);

INSERT INTO departments (id, name, email_alias, created_by, created_time, modified_by, modified_time, org_id, parent_department_id, type )
VALUES (uuid_generate_v4(), 'Finance', 'ACCOUNTSPAYABLE@FISSIONLABS.COM', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL', NULL, 'Finance');

INSERT INTO departments (id, name, email_alias, created_by, created_time, modified_by, modified_time, org_id, parent_department_id, type )
VALUES (uuid_generate_v4(), 'FACILITIES', NULL, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL', NULL, 'FACILITIES');

INSERT INTO departments (id, name, email_alias, created_by, created_time, modified_by, modified_time, org_id, parent_department_id, type )
VALUES (uuid_generate_v4(), 'SALES & MARKETING', NULL, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL', NULL, 'SALES & MARKETING');

INSERT INTO departments (id, name, email_alias, created_by, created_time, modified_by, modified_time, org_id, parent_department_id, type )
VALUES (uuid_generate_v4(), 'ENGINEERING', NULL, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL', NULL, 'ENGINEERING');

INSERT INTO departments (id, name, email_alias, created_by, created_time, modified_by, modified_time, org_id, parent_department_id, type )
VALUES (uuid_generate_v4(), 'IT & NETWORK', 'ITADMIN@FISSIONLABS.COM', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL', NULL, 'IT & NETWORK');

INSERT INTO departments (id, name, email_alias, created_by, created_time, modified_by, modified_time, org_id, parent_department_id, type )
VALUES (uuid_generate_v4(), 'HR&TA', 'HR@FISSIONLABS.COM', 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL1010 - Nishita - Algubelli', CURRENT_TIMESTAMP, 'FL', NULL, 'HR&TA');


CREATE TABLE application_role (
  id VARCHAR(255) PRIMARY KEY,
 name VARCHAR(255)
);

INSERT INTO application_role (id, name) VALUES (uuid_generate_v4(), 'ROLE_TeamMember');
INSERT INTO application_role (id, name) VALUES (uuid_generate_v4(), 'ROLE_TeamIncharge');
INSERT INTO application_role (id, name) VALUES (uuid_generate_v4(), 'ROLE_Manager');
INSERT INTO application_role (id, name) VALUES (uuid_generate_v4(), 'ROLE_ResourceManager');
INSERT INTO application_role (id, name) VALUES (uuid_generate_v4(), 'ROLE_HR');
INSERT INTO application_role (id, name) VALUES (uuid_generate_v4(), 'ROLE_Admin');

















































