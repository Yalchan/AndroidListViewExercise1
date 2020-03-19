package com.example.yhn_task5_17621653;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ListView;
import android.os.Bundle;

import com.example.yhn_task5_17621653.adapter.AnimalArrayAdapter;
import com.example.yhn_task5_17621653.model.Animal;

import java.util.LinkedList;
/**
 * Използвах java.util.LinkedList зашото  моето Android Studio не разпознаваше java.util.ArrayList
 * дори и слек като го импортвах */
public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private AnimalArrayAdapter animalArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinkedList<Animal> animalList = createAnimalList();
        this.animalArrayAdapter = new AnimalArrayAdapter(this, animalList);
        this.listView = this.findViewById(R.id.lv_animals);
        this.listView.setAdapter(animalArrayAdapter);
    }

    private LinkedList<Animal> createAnimalList() {
        LinkedList<Animal> animalList = new LinkedList<>();
        int catPictureId = R.drawable.cat;
        int dogPictureId = R.drawable.dog;
        int henPictureId = R.drawable.hen;
        int cowPictureId = R.drawable.cow;
        int birdPictureId = R.drawable.bird;
        int polarBearPictureId = R.drawable.polar_bear;
        int sharkPictureId = R.drawable.shark;
        int sheepPictureId = R.drawable.sheep;
        int spiderPictureId = R.drawable.spider;
        int snakePictureId = R.drawable.snake;

        Animal cat = new Animal("cat", catPictureId);
        Animal dog = new Animal("dog", dogPictureId);
        Animal hen = new Animal("hen", henPictureId);
        Animal cow = new Animal("cow",cowPictureId);
        Animal bird = new Animal("bird",birdPictureId );
        Animal polarBear= new Animal("polar bear",polarBearPictureId);
        Animal shark= new Animal("shark",sharkPictureId);
        Animal sheep= new Animal("sheep",sheepPictureId);
        Animal spider= new Animal("spider",spiderPictureId);
        Animal snake= new Animal("snake",snakePictureId);
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(hen);
        animalList.add(cow);
        animalList.add(sheep);
        animalList.add(bird);
        animalList.add(polarBear);
        animalList.add(shark);
        animalList.add(spider);
        animalList.add(snake);
        return animalList;
    }
}
