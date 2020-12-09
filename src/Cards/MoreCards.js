import React, {Component} from "react";
import Card from './CardUI';

import ACimg1 from '../image-asset/Camping.jpg'
import ACimg2 from '../image-asset/best-travel-agancy-in-sri-lanka-home-2-or-4.jpg'
import ACimg3 from '../image-asset/image_processing20181012-4-13iikyk.jpg'


class MoreCards extends Component{

    render(){
    return(
        <React.Fragment>
            <h1 className="text-capitalize text-center my-5 text-white font-weight-bolder bg-danger">POPULAR GROUPS</h1>
            <h3 className="text-capitalize text-center my-5 text-danger">UPCOMING EVENTS</h3>
        <div className= "container-fluid d-flex justify-content-center">
            <div className= "row">
                <div className= "col-md-4">
                    <Card imgsrc={ACimg1} title="Camping" date="12th Dec 2020" time="05:00-7:00 am" seats="10 People" price="2500" />

                </div>
                <div className= "col-md-4" >
                    <Card imgsrc={ACimg2} title="Rowing" date="30th Dec 2020" time="09:00-11:00 am" seats="12 People" price="4000"/>

                </div>
                <div className= "col-md-4">
                    <Card imgsrc={ACimg3} title="Cycling" date="12th Dec 2020" time="03:00-7:00 am" seats="8 People" price="2000"/>

                </div>
            </div>
        </div>
        </React.Fragment>

    );
    }
}

export default MoreCards;
