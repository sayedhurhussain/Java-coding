  $value[]={'A','B','C','D','C')
	    foreach($sql as $key=>$value){
	    	for($i=0;$i<=6;$i++){
	    		$arr[$i] = $value[$i]; 
	    	}
	    	
	    	$options[]=$arr[0];
	    	$options[]=$arr[1];
	    	$options[]=$arr[2];
	    	$options[]=$arr[3];
		$ansID=$arr[4];
	    	$ansText=$arr[$ansID];
	    	
			shuffle($options);
			
			for($j=0;$j<=3;$j++){
				if($ansText==$options[$j]){
					$newID=$j+1;
					 echo '<br>QID='. $qID .' '.$ansText.'  Old Key='.$ansID.'| '.$options[$j].'  New key='.$newID.'<br>';
				}
			}