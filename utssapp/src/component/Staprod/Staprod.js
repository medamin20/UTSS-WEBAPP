import React, { useState, useEffect } from "react";
import { Line } from "react-chartjs-2";
import axios from "axios";

const Staprod = () => {
  const [chartData, setChartData] = useState({});
  const [priceProduct, setPriceProduct] = useState([]);
  const [weightProduct, setWeightProduct] = useState([]);

  const chart = () => {
    let prdprix = [];
    let prdweight = [];
    axios.get("http://localhost:6038/utss/tn/AllProducts")
      .then(res => {
        console.log(res);
        for (const dataObj of res.data.data) {
          prdprix.push(parseInt(dataObj.prdp));
          prdweight.push(parseInt(dataObj.prdw));
        }


        setChartData({
          labels: prdprix,
          datasets: [
            {
              label: "level of thiccness",
              data: prdweight,
              backgroundColor: ["rgba(75, 192, 192, 0.6)"],
              borderWidth: 4
            }
          ]
        });
      })
      .catch(err => {
        console.log(err);
      });
    console.log( prdprix, prdweight);
  };

  useEffect(() => {
    chart();
  }, []);
  return (
    <div className="App">
      <h1>Dankmemes</h1>
      <div>
        <Line
          data={chartData}
          options={{
            responsive: true,
            title: { text: "THICCNESS SCALE", display: true },
            scales: {
              yAxes: [
                {
                  ticks: {
                    autoSkip: true,
                    maxTicksLimit: 10,
                    beginAtZero: true
                  },
                  gridLines: {
                    display: false
                  }
                }
              ],
              xAxes: [
                {
                  gridLines: {
                    display: false
                  }
                }
              ]
            }
          }}
        />
      </div>
    </div>
  );
};

export default Staprod;