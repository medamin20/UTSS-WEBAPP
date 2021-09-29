import { ArrowDownward, ArrowDropDownCircleTwoTone, ArrowDropUpRounded, ArrowUpwardSharp } from "@material-ui/icons"
import "./featuredInfo.css"

export default function FeaturedInfo() {
    return (
        <div className="featured">
        <div className="featuredItem">
            
            <span className="featuredTitle">entrée stock</span>
            <div className="featuredMoneyContainer">
                <span className="featuredMoney">120</span>
                <span className="featuredMoneyRate">-11 <ArrowDownward className="featuredIcon negative" /></span>

            </div>

            <span className="featuredsub">Par rapport au mois dernier </span>
            </div>            


            <div className="featuredItem">
            
            <span className="featuredTitle">Sortie stock</span>
            <div className="featuredMoneyContainer">
                <span className="featuredMoney">39</span>
                <span className="featuredMoneyRate">-2 <ArrowDropUpRounded/></span>

            </div>

            <span className="featuredsub">Par rapport au mois dernier</span>
            </div>          


            <div className="featuredItem">
            
            <span className="featuredTitle">Prix</span>
            <div className="featuredMoneyContainer">
                <span className="featuredMoney">2.415 dt</span>
                <span className="featuredMoneyRate"> <ArrowUpwardSharp className="featuredIcon"/></span>

            </div>

            <span className="featuredsub">Par rapport au mois dernier</span>
            </div>          
        </div>
    )
}
