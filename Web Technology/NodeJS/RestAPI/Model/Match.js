const mongoose = require('mongoose');

const schema = mongoose.Schema({
   MatchID : Number,
   TeamOne : String,
   TeamTwo : String,
   WinnerTeam : String,
   MatchDate : Date,
   TeamOneImg : String,
   TeamTwoImg : String
});

module.exports = mongoose.model("Match",schema, "MatchResult");