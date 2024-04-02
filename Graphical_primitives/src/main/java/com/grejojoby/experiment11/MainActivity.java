package com.grejojoby.experiment11;
import android.graphics.Path;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        //Setting the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));

        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);

        //Creating the Paint Object and set its color & TextSize
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#FF03DAC5"));
        paint.setTextSize(50);



        //To draw a Rectangle
        canvas.drawText("Rectangle", 420, 150, paint);
        canvas.drawRect(400, 200, 650, 700, paint);

        //To draw a Circle
        //canvas.drawText("Circle", 120, 150, paint);
        //canvas.drawCircle(200, 350, 150, paint);

        //To draw a Square
       // canvas.drawText("Square", 120, 800, paint);
        //canvas.drawRect(50, 850, 350, 1150, paint);

        //To draw a Line
        canvas.drawText("Line", 480, 800, paint);
        canvas.drawLine(520, 850, 520, 1150, paint);

        //Creating the Path object for star shape
        Path path = new Path();
        float starSize = 220; // Size of the star
        float startX = 120; // X-coordinate of the starting point
        float startY =800;// Y-coordinate of the starting point

        path.moveTo(startX, startY); // Move to the starting point of the star
        path.lineTo(startX + starSize / 2, startY + starSize); // Draw a line to the next point
        path.lineTo(startX + starSize, startY + starSize); // Draw a line to the next point
        path.lineTo(startX + starSize * 3 / 4, startY + starSize * 3 / 4); // Draw a line to the next point
        path.lineTo(startX + starSize, startY + starSize / 2); // Draw a line to the next point
        path.lineTo(startX + starSize / 2, startY); // Draw a line to the next point
        path.lineTo(startX, startY + starSize / 2); // Draw a line to the next point
        path.lineTo(startX + starSize / 4, startY + starSize * 3 / 4); // Draw a line to the next point
        path.lineTo(startX, startY + starSize); // Draw a line to the next point
        path.lineTo(startX + starSize / 2, startY + starSize); // Draw a line to the next point
        path.close(); // Close the path to form a closed shape (star)

        //To draw a Star
        canvas.drawText("Star", startX + starSize / 4, startY - 20, paint); // Change the location of the text
        canvas.drawPath(path, paint);

        //Creating the Path object for hexagon shape
        Path hexagonPath = new Path();
        float hexagonSize = 150; // Size of the hexagon
        float hexagonStartX = 200; // X-coordinate of the starting point
        float hexagonStartY = 450; // Y-coordinate of the starting point

// Calculate the coordinates of the hexagon's vertices
        float[] hexagonVertices = new float[12];
        for (int s = 0; s < 6; s++) {
            float angle = (float) (2 * Math.PI / 6 * s);
            float x = (float) (hexagonStartX + hexagonSize * Math.cos(angle));
            float y = (float) (hexagonStartY + hexagonSize * Math.sin(angle));
            hexagonVertices[s * 2] = x;
            hexagonVertices[s * 2 + 1] = y;
        }

// Move to the first vertex
        hexagonPath.moveTo(hexagonVertices[0], hexagonVertices[1]);

// Draw lines to the other vertices to form the hexagon
        for (int s = 1; s< 6; s++) {
            hexagonPath.lineTo(hexagonVertices[s * 2], hexagonVertices[s * 2 + 1]);
        }

// Close the path to form a closed shape (hexagon)
        hexagonPath.close();

// To draw a Hexagon
        canvas.drawText("Hexagon", hexagonStartX - 120, hexagonStartY - 150, paint); // Change the location of the text
        canvas.drawPath(hexagonPath, paint);










    }
}