function fetchData(){
    return new Promise((resolve) =>{
        setTimeout(() => {
            resolve("Data received from server");
        },2000);
    });
}
async function getData(){
    console.log("Fetching Data....");
    let result = await fetchData();
    console.log(result);
}
getData();