import "./Sidebar.css"
import {AttachMoney, BarChart, ChatBubbleOutline, DynamicFeed, LineStyle,MailOutline,PermIdentity,Report,Storefront,Timeline, TrendingUp, WorkOutline} from "@material-ui/icons"
import { Link } from "react-router-dom"

export default function Sidebar() {
    return (
        <div className="sidebar">
            <div className="sidebarWrapper">
                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Stock managment</h3>
                    <ul className="sidebarList">

                        <Link to="/" className="link">
                        <li className="sidebarListItem active">
                            <LineStyle className="sidebarIcon"/>
                            accueil
                        </li>
                        
                        </Link>
                        




                        <li className="sidebarListItem">
                            <Timeline className="sidebarIcon"/>
                            statistiques 

                        </li>

                        <li className="sidebarListItem">
                            <TrendingUp className="sidebarIcon"/>
                            Mouvement
                        </li>

                        <li className="sidebarListItem">
                            <Report/>
                            Notifications
                        </li>

                        
                    </ul>
                </div>


                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Add products to a stock</h3>
                    <ul className="sidebarList">

                    <Link to="/addprod" className="link">
                        <li className="sidebarListItem ">
                            <PermIdentity/>
                            New Product ?
                        </li>
                        </Link>
                        <Link to="/listprod" className="link">
                        <li className="sidebarListItem">
                            <Storefront/>
                            List Products
                        </li>
                        </Link>
                       


                       
                        
                    </ul>
                </div>





                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Products</h3>
                    <ul className="sidebarList">



                    <Link to="/gesprodd" className="link">
                    
                    
                    <li className="sidebarListItem ">
                            <ChatBubbleOutline/>
                            Liste des Stocks
                        </li>
                    
                    
                    </Link>





                    <Link to="/addstock" className="link">
                        <li className="sidebarListItem">
                            <DynamicFeed/>
                            Ajouter un stock
                        </li>

                    </Link>



                    
                        
                        <li className="sidebarListItem ">
                            <BarChart/>
                            Reports
                        </li>
                        
                    </ul>
                </div>




                <div className="sidebarMenu">
                    <h3 className="sidebarTitle">Staff</h3>
                    <ul className="sidebarList">
                        
                        <li className="sidebarListItem">
                            <MailOutline/>
                            Mail
                        </li>

                        <li className="sidebarListItem">
                            <WorkOutline/>
                            Staff
                        </li>

                        

                        
                    </ul>
                </div>


            </div>

          
        </div>
    )
}
