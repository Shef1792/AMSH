@@ -103,6 +103,7 @@ $(document).ready(function()
	        <li class="active"><a href="index.jsp" title="Home">Home</a></li>
	  		<li><a href="grade.jsp">Grade Assignments</a></li>
	  	    <li><a href="group.jsp">Group Video Assignments</a></li>
	  	    <li><a href="report.jsp">Progress Report</a></li>
	  		<li><a href="logout.jsp">Logout</a></li>
      </ul>
	 </div>
@@ -110,37 +111,16 @@ $(document).ready(function()
	</div>
</div>
</div>
<div class="slider_bg">
 <div class="wrap">
 <section class="slider">
        <div class="flexslider carousel">
          <ul class="slides">
  	    		<li>
  	    	    <img src="images/thumbnail-slider-1.jpg" />
  	    		</li>
  	    		<li>
  	    	    <img src="images/thumbnail-slider-2.jpg" />
  	    		</li>
  	    		<li>
  	    	    <img src="images/thumbnail-slider-3.jpg" />
  	    		</li>
  	    		<li>
  	    	    <img src="images/thumbnail-slider-4.jpg" />
  	    		</li>
  	    		<li>
  	    	    <img src="images/thumbnail-slider-5.jpg" />
  	    		</li>
  	    		<li>
  	    	    <img src="images/thumbnail-slider-6.jpg" />
  	    		</li>
  	    		<li>
  	    	    <img src="images/thumbnail-slider-8.jpg" />
  	    		</li>
          </ul>
        </div>
    </section>

</div>
<div>
	<s:form action="getStudent" method="post" enctype="multipart/form-data">
            <s:doubleselect label="Class" name="clas" list="{'Class 1','Class 2','Class 3'}" doubleName="subject" doubleList="top == 'Class 1' ? 
         {'History','Science','Maths','Computer'} : top == 'Class 2' ? {'History','Science','Maths'} : {'History','Science'}" />
            <input type="file" name="upload" id="uploadfile" value="Document"/>            
    		<input type="submit" value="Search Assignments" />
    </s:form>
    
    <s:action name="loadSTData" executeResult="false"></s:action>
</div>
<div class="cont_bg">
<div class="wrap">