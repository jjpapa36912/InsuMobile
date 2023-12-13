import React, {useEffect, useState} from 'react';
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import Main from './pages/Main'
import Header from "./layout/Header";
import BoardList from "./components/BoardList";

const App = () => {
  return (
      <div>
        <Router>
          <Header/>
          <Routes>
            {/*<Switch>*/}
            {/*<Route path="/login" element={<LoginForm/>}/>*/}
            <Route path="/main" element={<Main/>}/>
            <Route path="/board" element={<BoardList />} />
            {/*</Switch>*/}
          </ Routes>
          {/* Add more routes as needed */}
        </Router>
      </div>
  )
      ;
};
// function App() {
//   const [hello, setHello] = useState('');

// useEffect(() => {
//   axios.get('/')
//   .then(response => setHello(response.data))
//   .catch(error => console.log(error))
// }, []);
// useEffect(() => {
//   fetch("/login")
//   .then((res)=>{
//     return res.json();
//   })
//   .then(function (result){
//     setHello(result);
//   })
// }, []);

//   return (
//       <div>
//         <Container>
//             <Router>
//               <Routes>
//                 {/*<Route path="/" element={<Main />}></Route>*/}
//                 <Route path="/sss" element={<LoginForm />}/>
//               </ Routes>
//             </ Router>
//         </Container>
//         백엔드에서 가져온 데이터입니다 : {hello}
//       </div>
//   );
// }

export default App;