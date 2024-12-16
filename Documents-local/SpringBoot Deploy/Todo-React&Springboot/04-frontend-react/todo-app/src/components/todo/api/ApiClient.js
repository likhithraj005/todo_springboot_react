import axios from 'axios'

export const apiClient = axios.create(
    {
        // baseURL: 'http://localhost:5000' //#CHANGE
        //baseURL: 'http://03restapifullstackh2-env.eba-tmxhn3ah.ap-south-1.elasticbeanstalk.com/'

        // baseURL: 'http://localhost:8080'
        //baseURL: process.env.REACT_APP_API_URL || 'http://localhost:8080', // Fallback to localhost if the environment variable is not set
        baseURL: process.env.REACT_APP_API_URL
    }
);

// Log the baseURL to the console to confirm it's being loaded from the environment
console.log('API Client Base URL:', process.env.REACT_APP_API_URL);

/* For Best Practices https://facebook.github.io/create-react-app/docs/adding-custom-environment-variables*/
