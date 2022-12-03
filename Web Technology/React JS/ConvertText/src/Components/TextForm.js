import '../index.css';
import { useState } from "react";

export default function TextForm(props){
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
    
    if (text === "")
        words =0;
    else
        words=text.split(" ").length;

    const [mode, setMode] = useState('light');

    const toggleMode = ()=>{
        if (mode === 'light'){
            setMode("dark");
            document.body.style.backgroundColor = "grey"
        }
        else{
            setMode("light");
            document.body.style.backgroundColor = "white"
        }
    }
    return(
        <div className={`container-fluid text-${mode==='light'?'dark':'light'}`}>
            <div class={`form-check form-switch float-end m-4 `}>
                <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault"
                    onClick={toggleMode}
                />
                <label class="form-check-label fw-bold" for="flexSwitchCheckDefault">Dark Mode</label>
            </div>
            <div className="container my-3 mb-3">
                <label htmlFor="myText" className="form-label"><h2>Enter the Text Below : </h2></label>
                <textarea className="textBox form-control" id="myText" value={text} onChange={onUpper} rows="7"></textarea>
            </div>
            <div className="container-sm">    
                <button type="button" className={`btn btn-outline-${mode==='light'?'dark':'light'} mx-2`} onClick={toUpper}><b>UpperCase</b></button>
                <button type="button" className={`btn btn-outline-${mode==='light'?'dark':'light'} mx-2`} onClick={toLower}><b>LowerCase</b></button>
            </div>
            <div className="row border border-success justify-content-center my-5">
                <span className='info h4 text-center'>Characters Counts with Spaces</span>
                <div className={`col-md-4 border border-${mode==='light'?'dark':'light'} m-2`}>
                    <p className='h3 text-center'>Words : {words}</p>
                </div>
                <div className={`col-md-4 border border-${mode==='light'?'dark':'light'} m-2`}>
                    <p className='h3 text-center'>Characters : {text.length}</p>
                </div>
                <div className={`col-md-4 border border-${mode==='light'?'dark':'light'} m-2`}>
                    <p className='h3 text-center'>Read Duration : {words*0.008} Minutes</p>
                </div>
            </div>
        </div>
    );
}