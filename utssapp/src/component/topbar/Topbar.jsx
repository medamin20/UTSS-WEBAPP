import React from 'react'
import "./Topbar.css"
import user from './user.png';
import {NotificationsActive,Language,Settings} from '@material-ui/icons';

export default function Topbar() {
    return (
        <div className="topbar">
        <div className="topbarWrapper">
                <div className="topLeft">
                        <span className="logo">UTSS</span>
                </div>

                    <div className="topRight">

                    <div className="topbarIconContainer">
                        <NotificationsActive/>
                        <span className="topIconBadge">2</span>

                    </div>

                    

                    <div className="topbarIconContainer">
                        <Language/>
                        

                    </div>


                    <div className="topbarIconContainer">
                        <Settings/>
                        <span className="topIconBadge">2</span>

                    </div>

                    <img src={user} className="topavatar"/>

             </div>
        </div>
        </div>
    )
}
