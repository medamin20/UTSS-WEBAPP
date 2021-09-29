import React, { Component } from 'react'
import { LineChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Legend, ResponsiveContainer } from 'recharts';

export default class Chart extends Component {
  render() {

    const dat = [
      {
        name: 'Jan',
        "Mouvement": 900,
        pv: 2400,
        amt: 2400,
      },
      {
        name: 'Feb',
        "Mouvement": 10,
        pv: 1398,
        amt: 2210,
      },
      {
        name: 'Mar',
        "Mouvement": 2000,
        pv: 9800,
        amt: 2290,
      },
      {
        name: 'Apr',
        "Mouvement": 2780,
        pv: 3908,
        amt: 2000,
      },
      {
        name: 'May',
        "Mouvement": 1890,
        pv: 4800,
        amt: 2181,
      },
      {
        name: 'Jun',
        "Mouvement": 2390,
        pv: 3800,
        amt: 2500,
      },
      {
        name: 'Jul',
        "Mouvement": 3490,
        pv: 4300,
        amt: 2100,
      },

      {
        name: 'Agu',
        "Mouvement": 3490,
        pv: 4300,
        amt: 2000,
      },
      {
        name: 'Sep',
        "Mouvement": 2800,
        pv: 4300,
        amt: 2900,
      },
      {
        name: 'Oct',
        "Mouvement": 3200,
        pv: 4300,
        amt: 2100,
      },
      {
        name: 'Nov',
        "Mouvement": 3300,
        pv: 4300,
        amt: 2100,
      },
      {
        name: 'Dec',
        "Mouvement": 3490,
        pv: 4300,
        amt: 2100,
      },
    ];


    return (
      <div className="chart">
      <h3 className="chartTitle">Statistiques des produits</h3>
      <ResponsiveContainer  width="100%" aspect={4 / 1} >

      <LineChart data={dat}>

          <XAxis dataKey="name" stroke="#5550bd"/>
          <Line type ="monotone" dataKey="Mouvement" stroke="#5550bd" />

      <Tooltip/>
      
      
      <CartesianGrid stroke="#e0dfdf"  strokeDasharray="5 5"/>
      </LineChart>

   

      </ResponsiveContainer>
 
      
  </div>
    )
  }
}



// import  "./chart.css";
// import { LineChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Legend, ResponsiveContainer } from 'recharts';


// export default function Chart() {

//     const dat = [
//         {
//           name: 'Jan',
//           "Mouvement": 900,
//           pv: 2400,
//           amt: 2400,
//         },
//         {
//           name: 'Feb',
//           "Mouvement": 3000,
//           pv: 1398,
//           amt: 2210,
//         },
//         {
//           name: 'Mar',
//           "Mouvement": 2000,
//           pv: 9800,
//           amt: 2290,
//         },
//         {
//           name: 'Apr',
//           "Mouvement": 2780,
//           pv: 3908,
//           amt: 2000,
//         },
//         {
//           name: 'May',
//           "Mouvement": 1890,
//           pv: 4800,
//           amt: 2181,
//         },
//         {
//           name: 'Jun',
//           "Mouvement": 2390,
//           pv: 3800,
//           amt: 2500,
//         },
//         {
//           name: 'Jul',
//           "Mouvement": 3490,
//           pv: 4300,
//           amt: 2100,
//         },

//         {
//           name: 'Agu',
//           "Mouvement": 3490,
//           pv: 4300,
//           amt: 2000,
//         },
//         {
//           name: 'Sep',
//           "Mouvement": 2800,
//           pv: 4300,
//           amt: 2900,
//         },
//         {
//           name: 'Oct',
//           "Mouvement": 3200,
//           pv: 4300,
//           amt: 2100,
//         },
//         {
//           name: 'Nov',
//           "Mouvement": 3300,
//           pv: 4300,
//           amt: 2100,
//         },
//         {
//           name: 'Dec',
//           "Mouvement": 3490,
//           pv: 4300,
//           amt: 2100,
//         },
//       ];


//     return (
//         <div className="chart">
//             <h3 className="chartTitle">Statistiques des produits</h3>
//             <ResponsiveContainer  width="100%" aspect={4 / 1} >

//             <LineChart data={dat}>

//                 <XAxis dataKey="name" stroke="#5550bd"/>
//                 <Line type ="monotone" dataKey="Mouvement" stroke="#5550bd" />

//             <Tooltip/>
            
            
//             <CartesianGrid stroke="#e0dfdf"  strokeDasharray="5 5"/>
//             </LineChart>

         

//             </ResponsiveContainer>
       
            
//         </div>
//     );
// }

