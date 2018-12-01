package com.example.acer.test2;

public class ListQ {
    Question[] question = new Question[10];

    public void InitList(){
        for (int i=0;i<10;i++){
            question[i] = new Question();
        }
        question[0].q="HN là thủ đô của VN?";
        question[0].a=true;
        question[1].q="VN có thủ đô là Bến Tre?";
        question[1].a=false;
        question[2].q="Cơ sở A của HUTECH nằm ở quận Bình Thạnh?";
        question[2].a=true;

    }
}
