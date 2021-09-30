import React, { Component } from 'react'
import Chart from "../../component/chart/Chart"
import FeaturedInfo from "../../component/featuredInfo/FeaturedInfo"
import Widgetutss from "../../component/widgetutss/Widgetutss"
import "./home.css"

export default class Home extends Component {
    render() {
        return (
            <div className="home">
                 <Chart/>
            <Widgetutss/>
            <FeaturedInfo/>
            
            </div>
        )
    }
}



