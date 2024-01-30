import { useState, useEffect } from "react";
import { Carousel } from "flowbite-react";
import { CarouselTheme } from "../themes/CarouselTheme";

import axios from "axios";

import MyCard from "./MyCard";

type MyCard = {
  mycardId: number;
  myCardName: string;
  myCardImage: string;
};

export default function CardList() {
  const [cardList, setCardList] = useState<MyCard[]>();

  useEffect(() => {
    axios.get(`${import.meta.env.VITE_BASE_URL}/card/1`).then(({ data }) => {
      setCardList(data.cardList);
    });
  }, []);

  return (
    <div className="flex">
      <Carousel theme={CarouselTheme} slide={false}>
        {cardList && cardList.map((card) => {
          return (
            <MyCard
              key={card.mycardId}
              myCardImage={card.myCardImage}
              myCardName={card.myCardName}
            />
          );
        })}
      </Carousel>
    </div>
  );
}
