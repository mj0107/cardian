# React-Project-FE(A803)

## 🖥 프로젝트 소개

소비내역에 따른 카드 활용 서비스 프로젝트를 위한 프론트엔드 파일입니다.

**특징**
- 모바일과 PC에서 모두 사용할 수 있도록 반응형 웹 사이트 구현
- 소비패턴과 연말정산 결과를 그래프를 활용해 가시성을 높임
- tailwindCSS를 적용하여 UI에 대한 통일성 강화
- 피그마 화면 설계서를 토대로 명확한 기준에 맞춰 UI 개발

## 📆 개발 기간

- 24.01.08 ~ 24.02.16

## 🙎 멤버 구성

- 김민준: 카드 이용내역, Auth, 카테고리별 카드 추천
- 문성현: 연말정산, 매장 별 혜택 검색
- 임소현: 카테고리별 통계 및 이용내역, 전체 메뉴, 라우팅

## ⚙ 개발 환경

- React
- typescript(5.2.2)
- tailwindCSS(3.4.1)
- vite(5.0.8)
- IDE: VSCode

## 필수 조건

- 사용한 dependency
    - axios(4.4.1)
    - zustand(4.5.0)
    - react-router-dom(6.21.3)
    - chart.js(4.4.1)
    - chartjs-plugin-datalabels(2.2.0)
    - react-icons(5.0.1)


## 📡 배포 가이드
* `4. Cardian FE 참조`

  https://ruddy-gram-071.notion.site/c440d313b9aa46acbfff560aa7fd1a9d#3c81f333b8d74b66be1a1dc150ad8c5b

## 📌주요 기능

- 로그인
- 홈
- 카드 이용 내역 및 혜택
- 매장 별 혜택 검색
- 카테고리 별 통계(비교)
- 연말정산
- 전체 메뉴


### 로그인
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/36a36982-7e53-42d0-b0d6-764b66cf9cec" width="300">
</p>

### 홈
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/6e341813-aca8-4740-81cf-a94193ab5e45" width="300">
</p>

### 카드 이용내역 및 혜택
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/d1b0d856-2b30-4fdc-bfce-1c38bde84771" width="300">
</p>

### 매장별 혜택 검색
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/f526fcb2-9005-4a04-881a-3a358fa192b6" width="300">
</p>

### 카테고리 별 통계
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/c9e1fc0d-c22a-4cc7-9840-9a93a4c748d8" width="300">
</p>

### 연말정산
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/1b2079da-24a1-433c-9707-0c3dd7ab4632" width="300">
</p>

### 카테고리 별 카드 추천
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/b50a0be5-f7c2-4918-848f-b6529c560e67" width="300">
</p>

### 전체메뉴
<p align="center">
  <img src="https://github.com/mj0107/cardian/assets/61671704/cbeaf2da-501d-40c9-a838-70b5bfa7703b" width="300">
</p>

## 프로젝트 구조
```
📦FrontEnd
 ┣ 📂dist
 ┃ ┣ 📂assets
 ┃ ┃ ┣ 📜index-2chmjevc.js
 ┃ ┃ ┗ 📜index-vHHw50Ki.css
 ┃ ┗ 📜index.html
 ┣ 📂src
 ┃ ┣ 📂api
 ┃ ┃ ┗ 📜index.ts
 ┃ ┣ 📂assets
 ┃ ┃ ┗ 📜logo.png
 ┃ ┣ 📂components
 ┃ ┃ ┣ 📂CardBenefit
 ┃ ┃ ┃ ┣ 📜BenefitItem.tsx
 ┃ ┃ ┃ ┣ 📜BenefitList.tsx
 ┃ ┃ ┃ ┣ 📜CardBenefitList.tsx
 ┃ ┃ ┃ ┗ 📜CategoryBenefit.tsx
 ┃ ┃ ┣ 📂CardDetail
 ┃ ┃ ┃ ┣ 📜CardDetail.tsx
 ┃ ┃ ┃ ┗ 📜CardDetailTabs.tsx
 ┃ ┃ ┣ 📂CardTransaction
 ┃ ┃ ┃ ┣ 📜CardTransaction.tsx
 ┃ ┃ ┃ ┣ 📜CardTransactionDailyList.tsx
 ┃ ┃ ┃ ┣ 📜CardTransactionDailyListItem.tsx
 ┃ ┃ ┃ ┣ 📜CardTransactionListItemLogo.tsx
 ┃ ┃ ┃ ┗ 📜CardTransactionMonthlyList.tsx
 ┃ ┃ ┣ 📂Login
 ┃ ┃ ┃ ┣ 📜LoginStep1.tsx
 ┃ ┃ ┃ ┣ 📜LoginStep2.tsx
 ┃ ┃ ┃ ┣ 📜NextButton.tsx
 ┃ ┃ ┃ ┗ 📜PrevButton.tsx
 ┃ ┃ ┣ 📂MyCard
 ┃ ┃ ┃ ┣ 📜MyCard.tsx
 ┃ ┃ ┃ ┗ 📜MyCardList.tsx
 ┃ ┃ ┣ 📂Search
 ┃ ┃ ┃ ┣ 📜Brand.tsx
 ┃ ┃ ┃ ┣ 📜BrandCategoryBar.tsx
 ┃ ┃ ┃ ┣ 📜BrandCategoryList.tsx
 ┃ ┃ ┃ ┣ 📜BrandKeywordBar.tsx
 ┃ ┃ ┃ ┣ 📜BrandKeywordList.tsx
 ┃ ┃ ┃ ┗ 📜BrandSearch.tsx
 ┃ ┃ ┗ 📂ui
 ┃ ┃ ┃ ┣ 📜Badge.tsx
 ┃ ┃ ┃ ┗ 📜ProgressBar.tsx
 ┃ ┣ 📂constants
 ┃ ┃ ┗ 📜cardInfo.ts
 ┃ ┣ 📂layouts
 ┃ ┃ ┣ 📜NavBar.tsx
 ┃ ┃ ┗ 📜TopBar.tsx
 ┃ ┣ 📂pages
 ┃ ┃ ┣ 📜CardDetailPage.tsx
 ┃ ┃ ┣ 📜LoginPage.tsx
 ┃ ┃ ┣ 📜MyCardPage.tsx
 ┃ ┃ ┗ 📜SearchPage.tsx
 ┃ ┣ 📂themes
 ┃ ┃ ┣ 📜CardDetailTabsTheme.ts
 ┃ ┃ ┣ 📜CarouselTheme.ts
 ┃ ┃ ┣ 📜CategoryDropdownTheme.ts
 ┃ ┃ ┗ 📜ProgressBarTheme.ts
 ┃ ┣ 📂utils
 ┃ ┃ ┗ 📜formatUtils.ts
 ┃ ┣ 📜App.css
 ┃ ┣ 📜App.tsx
 ┃ ┣ 📜index.css
 ┃ ┣ 📜main.tsx
 ┃ ┗ 📜vite-env.d.ts
 ┣ 📜.env
 ┣ 📜.eslintrc.cjs
 ┣ 📜.gitignore
 ┣ 📜Dockerfile
 ┣ 📜index.html
 ┣ 📜nginx.conf
 ┣ 📜package-lock.json
 ┣ 📜package.json
 ┣ 📜postcss.config.js
 ┣ 📜README.md
 ┣ 📜tailwind.config.js
 ┣ 📜tsconfig.json
 ┣ 📜tsconfig.node.json
 ┗ 📜vite.config.ts

```
