<p align="center">
  <h2 align="center">American Sign Language Detection Model with voice feedback SSD_Mobilenet trained on Google Colab</h2>
</p>

<p align="center">
<img src="https://img.shields.io/badge/Python-3.8.5-lightgrey?style=for-the-badge" alt="repo language">
<img src="https://img.shields.io/badge/Java-Android-lightgrey?style=for-the-badge" alt="repo language">

Sign_Language_detection_SSD_Mobilenet_Colab_TFLITE.ipynb

- Model Used - ssd_mobilenet_v2_fpnlite_320x320_coco17_tpu-8
- DL FrameWork Used - TensorFlow Version 2
- DataSet Used - [ASL By David Lee](https://app.roboflow.com/dataset/american-sign-language-letters-14kx4/)
- Platform - Google Colab Using GPU

Download the APK from [Google Drive](https://drive.google.com/file/d/1C2IDptaM8lSLHeJG_E4LT8Im0ZukaZFa/view)

- First of all I would like to thanks codePerfectPlus for such a wonderful blog and code. You can find their links below.
- This repo is just an extension to the original repo by codePerfectPlus 
- Link to the original [repo](https://github.com/codePerfectPlus/ASL) 
- Link to the blog by codePerfectPlus on [Real-time sign language detection android application using TensorFlow lite](https://dev.to/codeperfectplus/real-time-sign-language-detection-android-application-using-tensorflow-lite-2d9g)

## Addition to the original [repo](https://github.com/codePerfectPlus/ASL)
- I have just implemented a voice feedback feature for the alphabet recognized by the app.
- In the bottom sheet you can find the Text-To-Speech button in front of that a ImageView is implemented with a music sign logo.
- When you perform a sign in front of the camera and click on the icon it gives you feedback in voice.

## Implementation method
- First I have logged the output from the DetectorActivity.java
```
Log.i("Recognitionss", String.valueOf(results.get(0).getTitle()));
// passing the detected alphabet to xml
DetectorActivity.super.toShowOutput.setText(String.valueOf(results.get(0).getTitle()));
```
- Passing the result to the xml file
```
// define this in CameraActivity.java for storing the result
protected TextView toShowOutput;
```
- Using onClickListener for the ```mp3``` audio to be played when a particular alphabet is encountered
CameraActivity.java
```
@Override
  public void onClick(View v) {
    // some code
    ```
    // voice for the detected alphabet
    else if (v.getId() == R.id.speak1) {
      // this is the value we are showing
      EditText mEdit = findViewById(R.id.editText);
      String letter = mEdit.getText().toString();
      if (letter.equalsIgnoreCase("A")) {
        final MediaPlayer mp100 = MediaPlayer.create(this, R.raw.letter_a);
        mp100.start();
      }
      else if (letter.equalsIgnoreCase("B")) {
        final MediaPlayer mp100 = MediaPlayer.create(this, R.raw.letter_b);
        mp100.start();
      }
      // similarly you can implement for the other alphabet
```
- Not the ideal way to implement this method but as ```TTS``` or ```Text-To-Speech``` was causing me some issue so I implemented the feedback in a different manner. TTS would be the best approach or else you need to define sound for every alphabet or word inside your ```raw``` folder in android.
- You can raise the issue if you face any problem in the code.
