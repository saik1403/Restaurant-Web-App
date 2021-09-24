import { useState,useEffect } from 'react';
const Demo = () => {
    const url = 'http://localhost:8080/admin/getusers';

    const [, setData] = useState(null);
  useEffect(() => {
    fetch(url)
    .then(response => response.json())
    .then(data => {console.log(data);
    setData(data);});
  }, [url])
    return ( 
        <div className="App">
        <h1>Hi from demo</h1>
      </div>  
     );
}
export default Demo;