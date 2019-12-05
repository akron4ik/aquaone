DELETE FROM user_roles;
DELETE FROM products;
DELETE FROM users;
DELETE FROM cart;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password, phone, address) VALUES
  ('User', 'user@yandex.ru', '{noop}password', '8(985)123-4567', 'Moscow, Amurskay st, 48 - 52'),
  ('Admin', 'admin@gmail.com', '{noop}admin', '+7(916)123-7654', 'Voronezh, Lenin street, 1, 22'),
  ('User2', 'user@mail.ru', '{noop}password1', '8(985)123-0000', 'Moscow, Amurskay st, 48 - 52');


INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 100000),
  ('ROLE_ADMIN', 100001),
  ('ROLE_USER', 100001),
  ('ROLE_USER', 100002);


INSERT INTO products (name, description, price)
VALUES ('Вода 19 литров', 'Природная вода', 300),
       ('Вода 1.5 литра', 'Минеральная вода', 150),
       ('Вода 0.5 литра', 'Газированная вода', 85),
       ('Стаканчики', 'Пластиковые', 15),
       ('Ложечки', 'Для кофе', 100);
INSERT INTO cart (date, user_id, price) VALUES
  ('2019-12-01 10:30:00', 100000, 3000),
  ('2019-12-02 11:30:00', 100000, 5000),
  ('2019-12-03 20:30:00', 100001, 4400),
  ('2019-12-05 21:40:00', 100001, 1000),
  ('2019-12-01 11:40:00', 100002, 1800),
  ('2019-12-06 16:35:00', 100002, 1800);
