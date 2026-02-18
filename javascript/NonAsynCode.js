function fetchData(){
    setTimeout(() => {
        return "Data from server";
    },2000);
}
function main(){
    let data = fetchData();
    console.log("Received: ", data);
}
main();