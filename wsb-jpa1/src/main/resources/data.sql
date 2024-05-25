insert into address (id, address_line1, address_line2, city, postal_code)
            values (1, 'xx', 'yy', 'city', '62-030');
insert into address (city, address_line1, address_line2, postal_code)
            values ('CityA', 'Street 123', 'Apartment 1', '12-345');
insert into address (city, address_line1, address_line2, postal_code)
            values ('CityB', 'Avenue 45', 'Suite 2', '67-890');
insert into patient (first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
            values ('John', 'Doe', '123-456-7890', 'john.doe@example.com', 'PAT123', '1980-01-01', 1);
insert into patient (first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
            values ('Jane', 'Smith', '098-765-4321', 'jane.smith@example.com', 'PAT124', '1985-02-02', 2);
insert into patient (first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
            values ('Laura', 'Palmer', '111-222-3333', 'laura.palmer@example.com', 'PAT125', '1990-03-03', 3);
insert into doctor (first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values ('Alice', 'Brown', '555-123-4567', 'alice.brown@hospital.com', 'DOC456', 'SURGEON', 1);
insert into doctor (first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values ('Bob', 'Davis', '555-987-6543', 'bob.davis@clinic.com', 'DOC789', 'OCULIST', 2);
insert into doctor (first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
            values ('Clara', 'Oswald', '444-555-6666', 'clara.oswald@hospital.com', 'DOC101', 'DERMATOLOGIST', 3);
insert into visit (description, time, patient_id, doctor_id)
            values ('Annual Checkup', '2024-04-23 10:00:00', 1, 1);
insert into visit (description, time, patient_id, doctor_id)
            values ('Follow-up', '2024-04-24 14:00:00', 2, 2);
insert into visit (description, time, patient_id, doctor_id)
            values ('Routine Blood Test', '2024-05-05 09:30:00', 3, 3);
insert into visit (description, time, patient_id, doctor_id)
            values ('Routine Checkup', '2024-05-01 09:00:00', 1, 1);
insert into visit (description, time, patient_id, doctor_id)
            values ('Emergency', '2024-05-02 20:00:00', 1, 3);
insert into visit (description, time, patient_id, doctor_id)
            values ('Dental Checkup', '2024-05-04 13:00:00', 1, 2);
insert into medical_treatment (description, type, visit_id)
            values ('Ultrasound', 'USG', 1);
insert into medical_treatment (description, type, visit_id)
            values ('Electrocardiogram', 'EKG', 1);
insert into medical_treatment (description, type, visit_id)
            values ('X-Ray imaging', 'RTG', 2);
insert into medical_treatment (description, type, visit_id)
            values ('Ultrasound', 'USG', 3);

update patient set date_of_birth = '1975-12-15' where id = 1;
update patient set date_of_birth = '2001-06-20' where id = 2;