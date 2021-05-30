import React from "react";


 const ligne = ({id, username})=>{


    return (
        <div className="ligne-bancaire">
            <span>{id}</span>
            <span>{username}</span>
        </div>
    )
};

 export default ligne;
