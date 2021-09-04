# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview

## 사다리(생성) TODO

### default

- 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    - `|-----|-----|` 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

### todo

- 이름
  - [x] 사람의 이름은 최대 5글자까지만 가능하다.
  - [x] 사람 이름이 빈칸이 들어오면 Exception을 throw해야 한다.
  - [x] 사람 이름이 5글자가 넘어가면 Exception을 throw해야 한다.
  - [x] 사람의 이름은 쉼표를 기준으로 들어온다.

- 사다리
  - [x] 사다리의 높이를 저장할 수 있다.
  - [x] 사다리는 높이를 1이상 값만 받을 수 있다.
  - [x] 사다리의 한 라인에는 사람 수만큼의 point 좌표들을 가진다
  - [x] point 좌표의 오른쪽 값이 true이면 오른쪽 point와 연결되었다.
  - [x] 마지막 point는 항상 false가 들어와야 한다.
  - [x] 사다리에는 라인이 높이만큼 순서대로 저장되어있어야 한다.
  
- 다시 생각

~~- [x] point 좌표는 본인의 위치와 연결된 point의 참조값을 가진다(참조값은 null일 수 있다)~~
~~- [ ] 사다리에서 point 좌표를 생성할 때 random값이 true면 오른쪽 point와 link한다.~~
~~- [ ] 이미 왼쪽 point와 link된 point는 생성시 link과정을 생략한다.~~

- 입력
  - [x] 사람의 이름을 입력받을 수 있다.
  - [ ] 사다리의 높이를 입력받을 수 있다.

- 출력
  - [ ] 이름을 출력할 수 있다.
  - [ ] 이름 밑에 사다리를 출력할 수 있다.
  - [ ] 사다리의 폭이 "-----" 으로 출력된다.