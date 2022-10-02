const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');
const Match = require('./Model/Match');

mongoose.connect('mongodb://127.0.0.1:27017/Match')
.then(()=>{
    const app = express();
    app.use(bodyParser.urlencoded({ extended: false }))
    app.use(cors());

    app.get('/matches', async (req, res)=>{
        const data = await Match.find();
        res.send(data);
    });

    app.get('/match/:id', async (req, res)=>{
        const data = await Match.findOne({MatchID : req.params.id});
        res.send(data);
    });

    app.post('/match', async (req, res)=>{
        const mt = new Match();
        mt.MatchID = req.body.MatchID;
        mt.TeamOne = req.body.TeamOne;
        mt.TeamTwo = req.body.TeamTwo;
        mt.WinnerTeam = req.body.WinnerTeam;
        mt.MatchDate = req.body.MatchDate;
        mt.TeamOneImg = req.body.TeamOneImg;
        mt.TeamTwoImg = req.body.TeamTwoImg
        const data = await mt.save();
        res.send(data);
    });

    app.put('/match/:id', async (req, res)=>{
        const data = await Match.findOne({MatchID : req.params.id});
        data.TeamOne = req.body.TeamOne;
        data.TeamTwo = req.body.TeamTwo;
        data.WinnerTeam = req.body.WinnerTeam;
        data.MatchDate = req.body.MatchDate;
        data.TeamOneImg = req.body.TeamOneImg;
        data.TeamTwoImg = req.body.TeamTwoImg
        await data.save();
        res.send(data);
    });

    app.delete('/match/:id', async (req, res)=>{
        const data = await Match.deleteOne({MatchID : req.params.id});
        res.send(data);
    });

    app.listen(3003, ()=>{
        console.log("Server Starting...");
    });
});


