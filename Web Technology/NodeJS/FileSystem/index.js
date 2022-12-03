
const fs = require("fs");

// ====================== Synchronous Type =========================
        //Create a New File.

// fs.writeFileSync("demo.txt", "Hello, I'm Uttam Nagvadiya.");

        // OverWrite to Data.

// fs.writeFileSync("demo.txt", "How are you!");

// fs.appendFileSync("demo.txt", " Hii, I'm Uttam Nagvadiya.");



            // Read the File.
// const bufferData = fs.readFileSync("demo.txt");
// console.log(bufferData);
// ==>  <Buffer 44 65 61 72 20 55 54 41 4d 20 44 49 4e 45 53 48 20 4e 41 47 56 41 44 49 59 41 20 53 
//          2f 6f 2e 20 44 49 4e 45 53 48 42 48 41 49 20 4a 41 44 41 56 20 4e ... 657 more bytes>

// const data = bufferData.toString();
// console.log(data);


        // Copy the File.

// fs.copyFileSync("demo.txt", "ReadWrite.txt");
// console.log("File is Copied Successfully!");


        // Truncate the Data  
// fs.truncateSync("demo.txt");

        // Rename the File 
// fs.renameSync("ReadWrite.txt", "Read_Write.txt");

        // Path of the File
// const path = fs.realpathSync("Read_Write.txt");
// console.log(path);

        // Read the Folder/Directory.
// let dirBuffer = Buffer.from("RestAPI");
// fs.readdir(dirBuffer, (err, files)=>{
//     if (err){
//         console.log(err.message);
//     }
//     else{
//         console.log(files);
//     }
// });

        // Delete the File.
// fs.unlinkSync("demo.txt");












// ====================== Asynchronous Type =========================
        
// ===>>> Create the Directory/Folder
fs.mkdir("../Module", (err)=>{
        console.log("Folder Created.");
        console.log("Error : ", err);        
});

// ===>>> Create the New File
// fs.writeFile("./Demo/Bio.txt", "Hii, I'm Uttam Nagvadiya.", (err)=>{
//         console.log("File Created.");
//         console.log("Error : ", err);
// })

// when [ fs.writeFile() ] is call Again then data should be overwrite.

// ===>>> Append the Data
// fs.appendFile("./Demo/Bio.txt", "I am Study at Darshan University.", (err)=>{
//         console.log("Data Appended");
//         console.log("Error : ", err);
// });

// ===>>> Read the File
// fs.readFile("./Demo/Bio.txt", "utf-8", (err, data)=>{
//         console.log(data);
//         console.log("Error : ", err);
// });

// ===>>> Rename the File
// fs.rename("./Demo/Bio.txt", "./Demo/myBio.html", (err)=>{
//         console.log("File Renamed.");
//         console.log("Error : ", err);
// });

// ===>>> Read the Directory/Folder
// let directory = Buffer.from("Demo");
// fs.readdir(directory, (err, files)=>{
//     if (err){
//         console.log(err.message);
//     }
//     else{
//         console.log(files);
//     }
// });

// ===>>> Delete the File
// fs.unlink("./Demo/myBio.html", (err)=>{
//         console.log("File Deleted");
//         console.log("Error : ", err);
// })

// ===>>> Delete the Directory/Folder
// fs.rmdir("./Demo", (err)=>{
//         console.log("Directory Deleted");
//         console.log("Error : ", err);
// });

// fs.stat("Read_Write.txt", (err,data)=>{
//         console.log(err);
//         console.log(data);
// });
