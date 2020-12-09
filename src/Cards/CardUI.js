 import React from 'react';
//import camp from '../image-asset/Camping.jpg';
import './Card-style.css';
// import CardHeader from '@material-ui/core/CardHeader';
 import { MdEvent } from "react-icons/md";
 import { MdAccessTime } from "react-icons/md"
 import {GrGroup} from "react-icons/gr";

 const Card= props =>{
    return(

        <div className= "card-text-center">
            <div className= "overflow">
                <img src= {props.imgsrc} height="300"  width="200" alt= "Camping" className="card-img-top"/>
            </div>
            <div className="card-body text-dark">
            <h4 className="card-title">{props.title}</h4>
            <p className=" card-text-center"> Organized by Advent Park for happy and advent you </p>
            <p className= "mb-2 text-muted "><MdEvent/>{props.date}</p>
            <p className="mb-2 text-muted "> <MdAccessTime/>{props.time} </p>
                <p className="mb-2 text-muted "> <GrGroup/>{props.seats} </p>
                <p className="font-weight-bolder "> LKR: {props.price} </p>
        </div>
         </div>


    );

}



export default Card;
