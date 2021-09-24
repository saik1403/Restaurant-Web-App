const Logout = () => {
    let url = 'http://localhost:8080/users/logout';
    useEffect(() => {
        fetch(url)
        .then(res => {
          return res.json();
        })
        .then(data => {
          console.log(data);
        })
        .catch(err => {
        })
        alert("logout sucessfull")
       
    }, [url])
     //window.location.replace("http://localhost:3000/login");
    return ( <div><h1>LoGout Succesfull</h1></div> );
}
 
export default Logout;