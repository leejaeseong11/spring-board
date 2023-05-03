-- mysql -u root
-- CREATE DATABASE board_test;
CREATE DATABASE board;
USE board;

CREATE TABLE post (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    updated_date DATETIME NOT NULL
);

INSERT INTO post (title, content, updated_date)
VALUES
    ('Spring Boot로 게시판 만들기', 'Spring Boot와 MySQL, Thymeleaf를 활용하여 게시판 만드는 방법을 알아보자.', '2023-04-27 13:45:00'),
    ('JPA란 무엇인가?', 'JPA가 무엇인지, 그리고 왜 JPA를 사용해야 하는지 알아보자.', '2023-04-26 10:30:00'),
    ('Java의 Stream API 사용법', 'Java의 Stream API를 활용하여 데이터를 처리하는 방법을 알아보자.', '2023-04-25 15:20:00'),
    ('JavaScript의 클로저 사용법', 'JavaScript에서 클로저를 사용하여 변수의 스코프를 제어하는 방법을 알아보자.', '2023-04-24 09:10:00'),
    ('HTML5에서 추가된 기능들', 'HTML5에서 추가된 새로운 기능들을 알아보고 활용해보자.', '2023-04-23 17:50:00'),
    ('CSS3에서 추가된 기능들', 'CSS3에서 추가된 새로운 기능들을 알아보고 활용해보자.', '2023-04-22 11:15:00'),
    ('React Hooks 사용법', 'React Hooks를 사용하여 함수형 컴포넌트에서 상태와 생명주기를 관리하는 방법을 알아보자.', '2023-04-21 08:40:00'),
    ('Vue.js로 SPA 만들기', 'Vue.js와 Vue Router를 사용하여 Single Page Application을 만드는 방법을 알아보자.', '2023-04-20 14:25:00'),
    ('Spring Security로 보안 설정하기', 'Spring Security를 사용하여 웹 애플리케이션의 보안 설정을 구현하는 방법을 알아보자.', '2023-04-19 12:00:00'),
    ('AWS Lambda로 서버리스 애플리케이션 만들기', 'AWS Lambda를 사용하여 서버리스 애플리케이션을 만드는 방법을 알아보자.', '2023-04-18 16:35:00');
