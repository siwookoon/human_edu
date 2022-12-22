# 데이터 가공
# dplyr
library(dplyr)

data("iris")
str(iris)

# filter 조건문, 행추출
#Sepal.length가 5 이상인 데이터 추출
# %>% 연결 연산자

data2 = iris %>% 
  filter(Sepal.Length >= 5) %>% 
  select(Sepal.Length, Petal.Length, Species) %>%
  group_by(Species) %>%
  summarise(total = sum(Sepal.Length),
            avg = mean(Sepal.Length))

data2
            