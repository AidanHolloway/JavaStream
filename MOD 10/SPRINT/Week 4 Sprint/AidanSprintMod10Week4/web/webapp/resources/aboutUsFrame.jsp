<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>aboutUsFrame</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' href='main.css'>
</head>
<body>
<div class="aboutUs">
  <img src="Images/AboutUsImages/schoolMusicClass.jpg" 
      style="float:right; width: 40%; height: auto;">
      <div class="aboutInfo">
  <h1>ABOUT US</h1>
  <h2>Introduction</h2>
  Mzamomtsha Primary School is a public primary school located at 49 Valangentambo Street. 
  It is one of the public primary schools in urban Driftsands suburb, 
  City of Cape Town in the Western Cape province of the Republic of South Africa. Mzamomtsha Primary School is located between Khayelistha Township and Umfuleni Township.
  It is a section 21 school with ABE functions and classified under quintile 3 as a no fee institution. 
  The school EMIS number is 106461792 and postal address at PO Box 40034, Elonwabeni, 7791.
  The school was initially created for primary school leaners from grade 1 to grade 7, but due to the rapid population growth the school also enrolling high grades up to grade 12.
 
  <p>The school was initially created for primary school students from grade 1 to grade 7, but due to the rapid population growth (births and migration) the school is
      also enrolling higher grades. <strong>Students are allowed up to grade 12 - which is the matric year.</strong></p>
  <h2>Vision</h2>
  <p>Our vision at Mzamomtsha Primary School is to empower students to acquire, demonstrate, articulate and value knowledge and skills that will support them,
      as life-long learners, to participate in and contribute to the global world and practice the core values of the school: <em>respect, tolerance & inclusion, and excellence.</em></p>
  <h2>Mission</h2>
  <p>Our mission is to develop students with active and creative minds, a sense of understanding and compassion for others, and the courage to act on their beliefs.
      We stress the total development of each child: spiritual, moral, intellectual, social, emotional, and physical.</p></div></div>
      
    <img class="aboutUsMobileImg" src="Images/AboutUsImages/schoolMusicClass.jpg">

    <div style="display: flex; justify-content: center; width: 100%; margin: 10px 0px;"><a href="#containFAQ">
    <button class="navBar" id="buttonFAQ" onclick="if(document.getElementById('containFAQ').style.display == 'none'){document.getElementById('containFAQ').style.display = 'block'} else{document.getElementById('containFAQ').style.display = 'none'}">FAQ</button>
    </a></div>


    <div id="containFAQ" style="display: none;">

      <p><i>Note: click on the question to show the answer, and on the question again to hide the answer.</i></p>
      <div class="faqCol">
<h2 style="margin-left: 10px;">Frequently asked questions about our school:</h2>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
div with id:answer1 has its display property value changed from display:none to display:block. The display
property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer1
already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('answer1').style.display=='none'){document.getElementById('answer1').style.display='block';}
else if(document.getElementById('answer1').style.display=='block'){document.getElementById('answer1').style.display='none';}">
  <p>Does This School Have A Particular Educational Philosophy?</p>
</div>
  <div id="answer1" style="display:none" class="answer">
    <p>This school sees its uniqueness in allowing teachers the ability to teach their students any way they see is appropriate to achieve their full potential in academics.</p>
  </div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
  div with id:answer2 has its display property value changed from display:none to display:block. The display
  property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer2
  already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('answer2').style.display=='none'){document.getElementById('answer2').style.display='block';}
else if(document.getElementById('answer2').style.display=='block'){document.getElementById('answer2').style.display='none';}">
  <p>How Do Administrators Evaluate Teachers?</p>
  
</div>
<div id="answer2" style="display:none" class="answer">
    <p>Teachers are evalulated based on the performance of the classes they teach, if a class is seen as lacking in progress
      the teacher will be held responsible and be dealt with if needed.</p>
  </div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
  div with id:answer3 has its display property value changed from display:none to display:block. The display
  property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer3
  already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('answer3').style.display=='none'){document.getElementById('answer3').style.display='block';}
else if(document.getElementById('answer3').style.display=='block'){document.getElementById('answer3').style.display='none';}">
  <p>How Much Does Lunch Cost?</p>
</div>
  <div id="answer3"  style="display:none;" class="answer">
    <p>Lunch is free for children at this school, but we also have a tuck shop which provides children with additional sweets and lunches
      such as burgers and sandwiches at addition costs.</p>
  </div>
</div>

<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
  div with id:answer4 has its display property value changed from display:none to display:block. The display
  property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer4
  already has a display:block property value set.-->
  <div class="question" onclick="if(document.getElementById('answer4').style.display=='none'){document.getElementById('answer4').style.display='block';}
else if(document.getElementById('answer4').style.display=='block'){document.getElementById('answer4').style.display='none';}">
  <p>Do The Kids Get Recess Every Day?</p>
</div>
  <div id="answer4"  style="display:none;" class="answer">
    <p>Yes, there is a total of 2 recess periods eveyday, a 25 minute recess is given after the third period, and a 15 minute recess
       is given after the sixth period of the day.</p>
  </div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
  div with id:answer5 has its display property value changed from display:none to display:block. The display
  property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer5
  already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('answer5').style.display=='none'){document.getElementById('answer5').style.display='block';}
else if(document.getElementById('answer5').style.display=='block'){document.getElementById('answer5').style.display='none';}">
  <p>How Many Kids Are In A Class?</p>
  </div>
  <div id="answer5"  style="display:none;" class="answer">
    <p>Currently we have about 700 pupils being given lessons be only 20 teachers in total. That means that roughly 35 children are in each class,
      but we aim to reduce that number in the future by building more classrooms and hiring more teachers to lessons the workload of the current teachers.</p>
  </div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
  div with id:answer6 has its display property value changed from display:none to display:block. The display
  property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer6
  already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('answer6').style.display=='none'){document.getElementById('answer6').style.display='block';}
else if(document.getElementById('answer6').style.display=='block'){document.getElementById('answer6').style.display='none';}">
  <p>Is There A Dress Code?</p>
</div>
  <div id="answer6"  style="display:none;" class="answer">
    <p>No, our school is a symbol of the freedom of creativity found in this country, and how our students dress is a reflection of that.
      We only ask that no inappropriate attire be worn.</p>
  </div>
</div>
</div>

</div>

<!--<div id="containBiography"></div>-->

<div style="display: flex; justify-content: center; width: 100%; margin: 10px 0px;"><a href="#containBiography">
  <button id="buttonBiography" class="navBar" onclick="if(document.getElementById('containBiography').style.display == 'none'){document.getElementById('containBiography').style.display = 'block'} else{document.getElementById('containBiography').style.display = 'none'}">School Staff</button>
  </a></div>


  <div id="containBiography" style="display: none;">

    <p><i>Note: click on the grades below to show the relevant information, click again to hide them.</i></p>
    <div class="faqCol">
<h2 style="margin-left: 10px;">Primary School</h2>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
div with id:answer1 has its display property value changed from display:none to display:block. The display
property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer1
already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('grade1').style.display=='none'){document.getElementById('grade1').style.display='block';}
else if(document.getElementById('grade1').style.display=='block'){document.getElementById('grade1').style.display='none';}">
<p>Grade 1</p>
</div>
<div id="grade1" style="display:none" class="answer">
  <div class="gradeImageHolder">
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr1A.jpg"><p style="margin-left: 0%;">A. Mr Samuels (24) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr1B.jpg"><p style="margin-left: 0%;">B. Ms Dlamini (24) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr1C.jpg"><p style="margin-left: 0%;">C. Mrs Khumalo (33) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr1D.jpg"><p style="margin-left: 0%;">D. Mr Nkhosi (21) </p></div>
  </div>
</div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
div with id:grade1 has its display property value changed from display:none to display:block. The display
property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer2
already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('grade2').style.display=='none'){document.getElementById('grade2').style.display='block';}
else if(document.getElementById('grade2').style.display=='block'){document.getElementById('grade2').style.display='none';}">
<p>Grade 2</p>

</div>
<div id="grade2" style="display:none" class="answer">
  <div class="gradeImageHolder">
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr2A.jpg"><p style="margin-left: 0%;">A. Mr Kapile (33) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr2B.jpg"><p style="margin-left: 0%;">B. Mr Smith (41) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr2C.jpg"><p style="margin-left: 0%;">C. Ms Visser (50) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr2D.jpg"><p style="margin-left: 0%;">D. Mrs Madziya (43) </p></div>
  </div>
</div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
div with id:grade2 has its display property value changed from display:none to display:block. The display
property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer3
already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('grade3').style.display=='none'){document.getElementById('grade3').style.display='block';}
else if(document.getElementById('grade3').style.display=='block'){document.getElementById('grade3').style.display='none';}">
<p>Grade 3</p>
</div>
<div id="grade3"  style="display:none;" class="answer">
  <div class="gradeImageHolder">
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr3A.jpg"><p style="margin-left: 0%;">A. Mr Smith (31) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr3B.jpg"><p style="margin-left: 0%;">B. Mr Ngweni (29) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr3C.jpg"><p style="margin-left: 0%;">C. Mr Ngobenya (37) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr3D.jpg"><p style="margin-left: 0%;">D. Mrs Adams (47) </p></div>
  </div>
</div>
</div>

<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
div with id:grade3 has its display property value changed from display:none to display:block. The display
property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer4
already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('grade4').style.display=='none'){document.getElementById('grade4').style.display='block';}
else if(document.getElementById('grade4').style.display=='block'){document.getElementById('grade4').style.display='none';}">
<p>Grade 4</p>
</div>
<div id="grade4"  style="display:none;" class="answer">
  <div class="gradeImageHolder">
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr4A.jpg"><p style="margin-left: 0%;">A. Mrs Matenga (45) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr4B.jpg"><p style="margin-left: 0%;">B. Ms Mtshali (39) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr4C.jpg"><p style="margin-left: 0%;">C. Mr Matenga (42) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr4D.jpg"><p style="margin-left: 0%;">D. Mr Mchumu (46) </p></div>
  </div>
</div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
div with id:grade4 has its display property value changed from display:none to display:block. The display
property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer5
already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('grade5').style.display=='none'){document.getElementById('grade5').style.display='block';}
else if(document.getElementById('grade5').style.display=='block'){document.getElementById('grade5').style.display='none';}">
<p>Grade 5</p>
</div>
<div id="grade5"  style="display:none;" class="answer">
  <div class="gradeImageHolder">
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr5A.jpg"><p style="margin-left: 0%;">A. Mr Dent (28) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr5B.jpg"><p style="margin-left: 0%;">B. Mrs vilikazi (63) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr5C.jpg"><p style="margin-left: 0%;">C. Mr Zondi (37) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr5D.jpg"><p style="margin-left: 0%;">D. Mr Mkhwanzie (44) </p></div>
  </div>
</div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
div with id:grade5 has its display property value changed from display:none to display:block. The display
property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer6
already has a display:block property value set.-->
<div class="question" onclick="if(document.getElementById('grade6').style.display=='none'){document.getElementById('grade6').style.display='block';}
else if(document.getElementById('grade6').style.display=='block'){document.getElementById('grade6').style.display='none';}">
<p>Grade 6</p>
</div>
<div id="grade6"  style="display:none;" class="answer">
  <div class="gradeImageHolder">
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr6A.jpg"><p style="margin-left: 0%;">A. Mrs Samuels (23) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr6B.jpg"><p style="margin-left: 0%;">B. Mr Kruger (29) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr6C.jpg"><p style="margin-left: 0%;">C. Mr Nkuni (22) </p></div>
    <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr6D.jpg"><p style="margin-left: 0%;">D. Mrs Xaba (32) </p></div>
  </div>
</div>
</div>
<div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
  div with id:grade6 has its display property value changed from display:none to display:block. The display
  property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer6
  already has a display:block property value set.-->
  <div class="question" onclick="if(document.getElementById('grade7').style.display=='none'){document.getElementById('grade7').style.display='block';}
  else if(document.getElementById('grade7').style.display=='block'){document.getElementById('grade7').style.display='none';}">
  <p>Grade 7</p>
  </div>
  <div id="grade7"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr7A.jpg"><p style="margin-left: 0%;">A. Mr Mokwena (39) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr7B.jpg"><p style="margin-left: 0%;">B. Mr Shongwe (50) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr7C.jpg"><p style="margin-left: 0%;">C. Mrs Mashabla (26) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGr7D.jpg"><p style="margin-left: 0%;">D. Mr Sibisi (42) </p></div>
    </div>
  </div>
  </div>
  <div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
    div with id:grade7 has its display property value changed from display:none to display:block. The display
    property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer6
    already has a display:block property value set.-->
    <div class="question" onclick="if(document.getElementById('creativeArts').style.display=='none'){document.getElementById('creativeArts').style.display='block';}
    else if(document.getElementById('creativeArts').style.display=='block'){document.getElementById('creativeArts').style.display='none';}">
    <p>Creative Arts</p>
    </div>
    <!--<div id="creativeArts"  style="display:none;" class="answer">
      <p></p>
    </div>-->
    <!--<div id="creativeArts"  style="display:none;" class="answer">
      <p>Mr Pienaar (42)</p>
      <img  id="principalImage" src="Images/AboutUsImages/musicLudwig.jpg">
    </div>-->
    <div id="creativeArts" style="display: none;" class="answer">
      <div class="gradeImageHolder">
        <div><img class="gradeImage" src="Images/AboutUsImages/creativeArts.jpg"><p style="margin-left: 0%;">Mr Pienaar (42)</p></div>
      </div>
    </div>
    </div>
  <div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
      div with id:answer6 has its display property value changed from display:none to display:block. The display
      property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer6
      already has a display:block property value set.-->
      <div class="question" onclick="if(document.getElementById('music').style.display=='none'){document.getElementById('music').style.display='block';}
      else if(document.getElementById('music').style.display=='block'){document.getElementById('music').style.display='none';}">
      <p>Music</p>
      </div>
     
      <div id="music" style="display: none;" class="answer">
        <div class="gradeImageHolder">
          <div><img class="gradeImage" src="Images/AboutUsImages/musicLudwig.jpg"><p style="margin-left: 0%;">Mr Ludwig (67)</p></div>
        </div>
      </div>
      </div>  
    
    <div><!--Inline JavaScript is used to receive an onClick-event as input. When receiving the input the 
          div with id:answer6 has its display property value changed from display:none to display:block. The display
          property value is changed from display:block to display:none if the onCLick-event takes place while the div with id:answer6
          already has a display:block property value set.-->
          <div class="question" onclick="if(document.getElementById('pE').style.display=='none'){document.getElementById('pE').style.display='block';}
          else if(document.getElementById('pE').style.display=='block'){document.getElementById('pE').style.display='none';}">
          <p>P.E.</p>
          </div>
          
          <div id="pE" style="display: none;" class="answer">
            <div class="gradeImageHolder">
              <div><img class="gradeImage" src="Images/AboutUsImages/pEMr.jpg"><p style="margin-left: 0%;">Mr Rapitsie (35)</p></div>
              <div><img class="gradeImage" src="Images/AboutUsImages/pEMrs.jpg"><p style="margin-left: 0%;">Mrs Barnes (22)</p></div>
            </div>
          </div>
    
          </div>
               


</div>


 <div class="faqCol">
<h2 style="margin-left: 10px;">High School</h2>
<div>
  <div class="question" onclick="if(document.getElementById('maths').style.display=='none'){document.getElementById('maths').style.display='block';}
  else if(document.getElementById('maths').style.display=='block'){document.getElementById('maths').style.display='none';}">
  <p>Maths</p>
  </div>
  <div id="maths" style="display:none" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsMathsA.jpg"><p style="margin-left: 0%;">Mr Moloi (56) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsMathsB.jpg"><p style="margin-left: 0%;">Mr Motaung (48) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsMathsC.jpg"><p style="margin-left: 0%;">Mrs Hlongwane (33) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsMathsD.jpg"><p style="margin-left: 0%;">Mr Abrahams (60) </p></div>
    </div>
  </div>
  </div>
  <div><div class="question" onclick="if(document.getElementById('xhosa').style.display=='none'){document.getElementById('xhosa').style.display='block';}
    else if(document.getElementById('xhosa').style.display=='block'){document.getElementById('xhosa').style.display='none';}">
    <p>Xhosa</p>
    </div>
    <div id="xhosa"  style="display:none;" class="answer">
      <div class="gradeImageHolder">
        <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsXhosaA.jpg"><p style="margin-left: 0%;">Ms Ncuthu (65) </p></div>
        <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsXhosaB.jpg"><p style="margin-left: 0%;">Mrs Khwalo (45) </p></div>
        <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsXhosaC.jpg"><p style="margin-left: 0%;">Mr Nonesi (31) </p></div>
        <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsXhosaD.jpg"><p style="margin-left: 0%;">Mr Qobo (65) </p></div>
      </div>
    </div>
</div>
<div><div class="question" onclick="if(document.getElementById('english').style.display=='none'){document.getElementById('english').style.display='block';}
  else if(document.getElementById('english').style.display=='block'){document.getElementById('english').style.display='none';}">
  <p>English</p>
  </div>
  <div id="english"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsEnglishA.jpg"><p style="margin-left: 0%;">Mr Teneson (39) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsEnglishB.jpg"><p style="margin-left: 0%;">Mrs Arnold (42) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsEnglishC.jpg"><p style="margin-left: 0%;">Ms Pluke (36) </p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsEnglishD.jpg"><p style="margin-left: 0%;">Mrs Isaacs (40) </p></div>
    </div>
  </div>
</div>
<div><div class="question" onclick="if(document.getElementById('bio').style.display=='none'){document.getElementById('bio').style.display='block';}
  else if(document.getElementById('bio').style.display=='block'){document.getElementById('bio').style.display='none';}">
  <p>Bio</p>
  </div>

  <div id="bio"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsBiologyA.jpg"><p style="margin-left: 0%;">Mr Tshabalala (51)</p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsBiologyB.jpg"><p style="margin-left: 0%;">Ms Zondi (30)</p></div>
      </div>
      </div>
    </div>
  

<div><div class="question" onclick="if(document.getElementById('physics').style.display=='none'){document.getElementById('physics').style.display='block';}
  else if(document.getElementById('physics').style.display=='block'){document.getElementById('physics').style.display='none';}">
  <p>Physics</p>
  </div>
  
  <div id="physics"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsPhysicsA.jpg"><p style="margin-left: 0%;">Mrs Davids (62)</p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsPhysicsB.jpg"><p style="margin-left: 0%;">Mr Prince (27)</p></div>
      </div>
      </div>

</div>
<div><div class="question" onclick="if(document.getElementById('geo').style.display=='none'){document.getElementById('geo').style.display='block';}
  else if(document.getElementById('geo').style.display=='block'){document.getElementById('geo').style.display='none';}">
  <p>Geography</p>
  </div>
  
  <div id="geo"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGeologyA.jpg"><p style="margin-left: 0%;">Ms Moses (33)</p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsGeologyB.jpg"><p style="margin-left: 0%;">Mrs Sibanda (36)</p></div>
      </div>
      </div>

</div>
<div><div class="question" onclick="if(document.getElementById('history').style.display=='none'){document.getElementById('history').style.display='block';}
  else if(document.getElementById('history').style.display=='block'){document.getElementById('history').style.display='none';}">
  <p>History</p>
  </div>
  
  <div id="history"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsHistoryA.jpg"><p style="margin-left: 0%;">Mr Maila (58)</p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsHistoryB.jpg"><p style="margin-left: 0%;">Mr Madonda (49)</p></div>
      </div>
      </div>

</div>
<div><div class="question" onclick="if(document.getElementById('accounting').style.display=='none'){document.getElementById('accounting').style.display='block';}
  else if(document.getElementById('accounting').style.display=='block'){document.getElementById('accounting').style.display='none';}">
  <p>Accounting</p>
  </div>
  
  <div id="accounting"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsAccountingA.jpg"><p style="margin-left: 0%;">Ms Phala (32)</p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsAccountingB.jpg"><p style="margin-left: 0%;">Mr De Bruyn (53)</p></div>
      </div>
      </div>

</div>
<div><div class="question" onclick="if(document.getElementById('business').style.display=='none'){document.getElementById('business').style.display='block';}
  else if(document.getElementById('business').style.display=='block'){document.getElementById('business').style.display='none';}">
  <p>Business</p>
  </div>
  
  <div id="business"  style="display:none;" class="answer">
    <div class="gradeImageHolder">
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsBusinessA.jpg"><p style="margin-left: 0%;">Mrs Zikalala (48)</p></div>
      <div><img class="gradeImage" src="Images/AboutUsImages/aboutUsBusinessB.jpg"><p style="margin-left: 0%;">Mr Sokhela (39)</p></div>
      </div>
      </div>

</div>


</div>


<div class="faqCol">
  <h2 style="margin-left: 10px;">Principal</h2>
  <div>
    <div class="question" onclick="if(document.getElementById('principal').style.display=='none'){document.getElementById('principal').style.display='block';}
    else if(document.getElementById('principal').style.display=='block'){document.getElementById('principal').style.display='none';}">
    <p>Biography</p>
    </div>
    <div id="principal" style="display:none" class="answer">
      <p>Mr A.Raboshada (44) <br><br>

        Mr Raboshada was born on the 25/05/1975 in Greyton. He was the youngest of 4 children and attended school in the local area. 
        He was mischievous growing up and almost failed matric were it not for a teacher who patiently sat 
        with him thrice a week and helped him revise. After successfully achieving his matric he took a gap year, 
        uncertain as to what he wanted to do his mind went back to the teacher who helped him and his choice was made. 
        <br><br>
        He acquired his bachelors in education at UCT and taught at an all-boys high school for 6 years before acquiring a 
        masters in education in leadership.
        <br><br>
        Raboshada has always had good relationships with students. This could be down to his love of sport and athletics and 
        the vibrant competitive nature he has, but more often than not it’s his calm and caring approach towards students that 
        earns him such an exceptional reputation.
        Rabashoda has been headmaster here since April 2018 and is continuing in his attempts to better education as a whole.
        <br><br>
        
          <div class="gradeImageHolder">
            <div><img class="gradeImage" src="Images/AboutUsImages/principal.jpg"><p style="margin-left: 0%;">Mr A.Raboshada (44)</p></div>
            </div>
            
        </p>
    </div>
    </div>

</div>
</div>
</body>
</html>
