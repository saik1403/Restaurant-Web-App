import { useState, useEffect } from 'react';

const useFetch = (url) => {
  const [data, setData] = useState(null);
  useEffect(() => {
    setTimeout(() => {
      fetch(url)
      .then(res => {
        if (!res.ok) { // error coming back from server
          throw Error('could not fetch the data for that resource');
        } 
        return res.json();
      })
      .then(data => {
        console.log(data);
        setData(data);
      
      })
      .catch(err => {
      })
    }, 10);
  }, [url])

  return { data };
}
 
export default useFetch;