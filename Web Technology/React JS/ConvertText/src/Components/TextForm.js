import '../index.css';
import { useState } from "react";

export default function TextForm(){
    const [text, setText] = useState('');
    const toUpper = ()=>{
        setText(text.toUpperCase());
    }
    const toLower = ()=>{
        setText(text.toLowerCase());
    }

    const onUpper = (e)=>{
        console.log(e);
        setText(e.target.value);
    }
    let words;
    
    if (text == "")
        words =0;
    else
        words=text.split(" ").length;

    return(
        <>
            <div className="container my-3 mb-3">
                <label htmlFor="myText" className="form-label"><h2>Enter the Text Below : </h2></label>
                <textarea className="textBox form-control" id="myText" value={text} onChange={onUpper} rows="7"></textarea>
            </div>
            <div className="container-sm">    
                <button type="button" className="btn btn-success mx-2" onClick={toUpper}><b>UpperCase</b></button>
                <button type="button" className="btn btn-success mx-2" onClick={toLower}><b>LowerCase</b></button>
            </div>
            <div className="row border border-success justify-content-center my-5">
                <span className='info h4 text-center'>Characters Counts with Spaces</span>
                <div className="col-md-4 border border-primary bg-dark m-2">
                <p className='h1 text-center text-warning'>Words : {words}</p>
                </div>
                <div className="col-md-4 border border-primary bg-dark m-2">
                    <p className='h1 text-center text-warning'>Characters : {text.length}</p>
                </div>
                <div className="col-md-6 border border-primary bg-dark m-2">
                    <p className='h1 text-center text-warning'>Read Duration : {words*0.008} Minutes</p>
                </div>
            </div>
        </>
    );
}