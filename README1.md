# Spring Boot와 JPA를 활용한 기본적인 CRUD 및 페이징 게시판 

---------------

# 기술 스택
## Framework : Spring boot 3.x
## DataBase : MySQL
## Language : java 17
## Build Tool : Gradle
## API 문서화: swagger

## iew Engine : ![JSP](https://img.shields.io/badge/JSP-orange?style=for-the-badge&logo=java&logoColor=white)  사용 

--------
#  주요 기능 (Features)

- [ ]  게시글 **목록 조회** API `GET /posts`
- [ ]  게시글 **단건 조회** API `GET /posts/{id}`
- [ ]  게시글 **수정** API `PUT /posts/{id}`
- [ ]  게시글 **삭제** API `DELETE /posts/{id}`
- [ ]  게시글 필드: `제목`, `내용`, `작성자`, `작성일`,`조회수`,
- [ ]  페이징 기반 웹페이지 구현
- [ ]  JPA 기반 구현


---------
# 프로젝트 프로그램 설치방법 및 실행

* 저장소 클론(Clone the repository)
* git clone https://github.com/park967/2026_cmt_learn.git
* cd 2026_cmt_learn 
* 데이터 베이스 이름 :  CREATE DATABASE mydb;
* 테이블 SQL : schema.sql 파일
* properties: 포트번호:8080
* Browser : http://localhost:8080/posts
* API Docs: http://localhost:8080/swagger-ui/index.html

 


