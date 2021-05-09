import axios from "axios";
import { useEffect, useState } from "react";
import Chart from 'react-apexcharts';
import { SaleSum } from "types/sale";
import { BASE_URL } from "utils/requests";

type ChartData = {
    labels: string[];
    series: number[];
}

const DonutChart = () => {

    const [chartData, setCharData] = useState<ChartData>({labels : [], series : []});

    useEffect(()=>{
        axios.get(`${BASE_URL}/sales/amountBySeller`)
        .then(response => {
            const respData = response.data as SaleSum[];

            const respLabels = respData.map(x => x.sellerName);
            const respSeries = respData.map(x => x.sum);

            setCharData({labels: respLabels, series: respSeries});
        });
    }
    , []);

    //FORMA ERRADA
    /* let chartData : ChartData = {labels : [], series : []}; */

    /* const mockData = {
        series: [477138, 499928, 444867, 220426, 473088],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    } */

    //FORMA ERRADA - chamada fora do useEffect
    /* axios.get(`${BASE_URL}/sales/amountBySeller`)
        .then(response => {
            const respData = response.data as SaleSum[];

            const respLabels = respData.map(x => x.sellerName);
            const respSeries = respData.map(x => x.sum);

            chartData = {labels: respLabels, series: respSeries};

            console.log(chartData);
        }); */

    
    const optionsLocal = {
        legend: {
            show: true
        }
    }

    return (
        <Chart 
            options={{...optionsLocal, labels:chartData.labels}}
            series={ chartData.series }
            type="donut"
            height="240"
        />
    );
}


export default DonutChart;